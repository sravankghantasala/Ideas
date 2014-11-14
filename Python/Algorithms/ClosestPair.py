'''
Created on 12 Nov 2014

@author: sraone
'''
from math import sqrt
from collections import namedtuple

Point2 = namedtuple('Point2', 'x y')

class ClosestPair(object):
    
    def get_distance(self, p1, p2):
        return sqrt((p1.x - p2.x) ** 2 + (p1.y - p2.y) ** 2)
    
    def get_closest_pair_for_point(self, point, points):
        d = 0
        for p in points:
            if not p == point:
                dist = self.get_distance(point, p)
                if dist < d or d == 0: 
                    closest = p
                    d = dist
        else:return (closest, d)
                
        
    def get_closest_pair(self, *points):
        closer = 0; pair = ()
        for point in points:
            p, d = self.get_closest_pair_for_point(point, points)
            if d < closer or closer == 0:
                pair = (point, p, d)
        else: return pair
    
if __name__ == '__main__':
    CP = ClosestPair()
    p1 = Point2(9, 7)
    p2 = Point2(3, 2)
    p3 = Point2(4, 3)
    p4 = Point2(4, 4)
    print(CP.get_closest_pair(p1, p2, p3, p4))
