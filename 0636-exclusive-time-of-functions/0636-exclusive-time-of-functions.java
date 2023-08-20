class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] execution_times = new int[n];
        for(int i = 0;i<execution_times.length;i++){
            execution_times[i] = 0;
        }
        int prev_start_time = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(String log : logs){
            String[] parts = log.split(":");

            int func_id = Integer.parseInt(parts[0]);
            String call_type = parts[1]; 
            int timestamp = Integer.parseInt(parts[2]);

            if(call_type.equals("start")){
                if(!stack.isEmpty()){
                    execution_times[stack.peek()] = execution_times[stack.peek()]+(timestamp-prev_start_time);
                }

                stack.push(func_id);
                prev_start_time = timestamp;
            }
            else{
                execution_times[stack.pop()] += timestamp-prev_start_time+1;
                prev_start_time = timestamp+1;
            }

        }
        return execution_times;
    }
}