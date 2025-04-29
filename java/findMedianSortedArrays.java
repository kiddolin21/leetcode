public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((nums1.length+nums2.length)/2+2
            ,new Comparator<Integer>()
            {
               @Override 
               public int compare(Integer a,Integer b) {
                   if(a>b) return 1;
                   if(a<b) return -1;
                   else return 0;
               }
            });
            
            PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((nums1.length+nums2.length)/2+2
            ,new Comparator<Integer>()
            {
               @Override 
               public int compare(Integer a,Integer b) {
                   if(a>b) return -1;
                   if(a<b) return 1;
                   else return 0;
               }
            });
            
            int p1 = 0,p2 = 0;
            if(nums1.length != 0 && nums2.length != 0) {
                minHeap.add(Math.max(nums1[p1],nums2[p2]));
                maxHeap.add(Math.min(nums1[p1],nums2[p2]));
            }
            else if(nums1.length == 0&&nums2.length!=0) minHeap.add(nums2[p2]);
            else if(nums2.length == 0&&nums1.length!=0) minHeap.add(nums1[p1]);
            
            p1++;
            p2++;
            
            while(p1<nums1.length || p2<nums2.length) {
                if(p1<nums1.length) {
                    if(maxHeap.isEmpty()||nums1[p1]<=maxHeap.peek())
                        maxHeap.add(nums1[p1]);
                    else minHeap.add(nums1[p1]);
                }
                
                if(p2<nums2.length) {
                    if(maxHeap.isEmpty()||nums2[p2]<=maxHeap.peek())
                        maxHeap.add(nums2[p2]);
                    else minHeap.add(nums2[p2]);
                }
                
                if(minHeap.size()-maxHeap.size()>1) {
                    maxHeap.add(minHeap.poll());
                } else if(maxHeap.size()-minHeap.size()>1) {
                    minHeap.add(maxHeap.poll());
                }
                
                p1++;
                p2++;
            }
            
            if((nums1.length+nums2.length)%2 == 0) return (double)(maxHeap.peek()+minHeap.peek())/2.0;
            else if(maxHeap.size()>minHeap.size()) return (double)maxHeap.peek();
            else return (double)minHeap.peek();
            
    }
