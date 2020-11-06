package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Interval {
	class interval {
		int start;
		int end;
		 void Interval() {
			start = 0;
			end = 0;
		}
		 void Interval(int s, int e) {
			 start = s;
			 end = e;
		 }
	}
	public int start;
	public int end;
	public class Solution {
		public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
			if (intervals == null || intervals.size() <= 1)
				return intervals;
			// sort intervals by using self-defined Comparator
			Collections.sort(intervals, new Comparator());
			ArrayList<Interval> result = new ArrayList<Interval>();
			Interval prev = intervals.get(0);
			for (int i = 1; i < intervals.size(); i++) {
				Interval curr = intervals.get(i);
				if (prev.end >= curr.start) {
					// merged case
					Interval merged = new Interval();
					prev = merged;
					}
				else {
					result.add(prev);
					prev = curr;
					}
				}
			result.add(prev);
			return result;
			}
		}
	class IntervalComparator implements Comparator<Interval> {
		public int compare(Interval i1, Interval i2) {
			return i1.start - i2.start;
			}
	}
