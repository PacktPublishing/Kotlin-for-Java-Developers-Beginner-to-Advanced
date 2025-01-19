public class Container {
    private String content;

    public Container(String content) {
        this.content = content;
    }

    public String getContent(){
        return  content;
    }

    public void setContent(String content){
        this.content = content;
    }

}

/* Container Generic
public class Container<T> {
        private T content;

        public Container(T content) {
            this.content = content;
        }

        public T getContent(){
            return  content;
        }

        public void setContent(T content){
            this.content = content;
        }

}

 */
