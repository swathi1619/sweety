package src;

import java.util.ArrayList;

/**
	 *Definition for an interval.
	 **public class Interval {
	 **int start;
	 **int end;
	 **Interval() { start = 0; end = 0; }
	 **Interval(int s, int e) { start = s; end = e; }
	 *}
	 */
	public class Solution {
		public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
			ArrayList<Interval> result = new ArrayList<Interval>();
			for(Interval interval: intervals){
				if(interval.start < newInterval.start){
					result.add(interval);
					}else if(interval.start > newInterval.start){
						result.add(newInterval);
						newInterval = interval;
						}
					else if(interval.start >= newInterval.start || interval.start <=newInterval.start){
						newInterval = new Interval();
						}
			}
			result.add(newInterval);
			return result;
			}
		}



