package edu.fiu.cs.kdrg.test;

import java.util.Arrays;

import gnu.trove.set.TIntSet;
import gnu.trove.set.hash.THashSet;
import gnu.trove.set.hash.TIntHashSet;
import gnu.trove.set.hash.TLinkedHashSet;

public class Test {
	public static THashSet regionSet = new TLinkedHashSet();
	
	public static void main(String[] args) {
		regionSet.add("NA");
		regionSet.add("NA");
		regionSet.add("First");
		for(Object i : regionSet.toArray()) {
			System.out.println(i + " ");
		}
		
		String str = "27 94 201 395 183 374 276 275 80 79 368 359 164 65 -1 253 55 344 146 238 333 40 134 325 124 216 308 15 106 298 394 393 3 2 1 0";
		int[] nums = new int[str.split(" ").length];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(str.split(" ")[i]);
		}
		Arrays.sort(nums);
		for(int j = 0; j < nums.length; j ++) {
			System.out.print(nums[j] +  " ");
		}
	}
}
