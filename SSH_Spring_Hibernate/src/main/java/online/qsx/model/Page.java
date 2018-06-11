package online.qsx.model;

/**
 * 分页实体类
 */
public class Page {

    private long totalpage; //总页数

    private long totalCount; //总记录数

    private int pageNow=1; //首页

    private int pageSize; //每页显示多少条

    public long getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(long totalpage) {
        this.totalpage = totalpage;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        if(totalCount>0){
            this.totalCount = totalCount;
            this.setTotalpage(3); //设置总页数
        }

    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        //判断当前页数是否大于0
        if(pageNow>0){
            this.pageNow = pageNow;
        }

    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        //判断显示的行数是否大于0
        if (pageSize>0){
            this.pageSize = pageSize;
        }

    }
    // 获取总的有多少页
    public void setTotalpage() {
        //总条数%每页显示的条数为0的时候
        if (this.totalCount%this.pageSize==0) {
            //计算出来共有多少页
            this.totalpage=this.totalCount/this.pageSize;
        }else if(this.totalCount%this.pageSize>0){
            this.totalpage=this.totalCount/this.pageSize+1;
        }else {
            this.totalpage=0;
        }
    }
}
