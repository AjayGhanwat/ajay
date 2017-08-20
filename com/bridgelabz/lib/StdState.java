/******************************************************************************************************
 *Perpose:  Library of statistical functions that takes array of real numbers from standard input,
 *          and computes the minimum, mean, maximum and standard deviation. 
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 20-08-2017
 ******************************************************************************************************/

package com.bridgelabz.lib;

class StdState{
	
	public static double max(double[] a){
		double mLargest = a[0];
		for(int i = 1; i < a.length; i++){
			if(a[i] > mLargest)
				mLargest = a[i];
		}
		return mLargest;
	}
	
	public static double min(double[] a){
		double mSmallest = a[0];
		for(int i = 1; i < a.length; i++){
			if(a[i] < mSmallest)
				mSmallest = a[i];
		}
		return mSmallest;
	}
	
	public static double mean(double[] a){
		double mMean = 0;
		int i;
		for(i = 0; i < a.length; i++){
			mMean += a[i];
		}
		mMean = mMean / i;
		return mMean;
	}
	
	public static double var(double[] a){
		double mMean = mean(a);
		double mSub,mSum = 0;
		int i;
		for(i = 0; i < a.length; i++){
			mSub = a[i] - mMean;
			mSub = Math.pow(mSub, 2);
			mSum +=mSub;
			mSub = 0;		
		}
		mSum = mSum /(i - 1);
		return mSum;		
	}
	
	public static double stddev(double[] a){
		double variance = var(a);
		variance = Math.sqrt(variance);
		return variance;
	}
	
	public static double median(double[] a){
		double temp;
		int i;
		for(i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		int nmedian = (i + 1) / 2; 
		double mMedian = a[nmedian - 1];
		
		return mMedian;
		
	}
	
	public static void main(String args[]){
		
	}
}