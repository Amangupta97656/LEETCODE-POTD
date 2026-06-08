class Solution {
    Node compute(Node head) {
        if(head==null || head.next==null) return head;
        
        Stack<Node> st=new Stack<>();
        Node curr=head;
        while(curr!=null){
            while(!st.isEmpty() && st.peek().data<curr.data){
                st.pop();
            }
            
            st.push(curr);
            curr=curr.next;
        }
        
        Node res=null;
        while(!st.isEmpty()){
            Node temp=st.pop();
            if(res!=null){
                temp.next=res;
            }
             res=temp;
        }
        return res;
    }
}