package kr.co.dw.domain;
import java.util.ArrayList;
import java.util.List;



public class itemPageTO<T> {
	private int curPage;
	private int perPage = 12;
	private int perLine = 10;
	private int amount;
	//totalPage = (amount-1) / perPage+1;
	/*if(amount % perPage ==0{
		totalPage = amount/perPage;
}*/
	private int totalPage;
	private int startNum;
	private int endNum;
	
	private int beginPageNum;
	private int finishPageNum;
	//((curPage-1)/perLine)*perLine +1;
	private List<T> list = new ArrayList<T>();
	
	public itemPageTO() {
		// TODO Auto-generated constructor stub
		calculate();
	}

	public itemPageTO(int curPage) {
		super();
		this.curPage = curPage;
		calculate();
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
		calculate();
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
		calculate();
	}

	public int getPerLine() {
		return perLine;
	}

	public void setPerLine(int perLine) {
		this.perLine = perLine;
		calculate();
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
		calculate();
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	
	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public int getBeginPageNum() {
		return beginPageNum;
	}

	public void setBeginPageNum(int beginPageNum) {
		this.beginPageNum = beginPageNum;
	}

	public int getFinishPageNum() {
		return finishPageNum;
	}

	public void setFinishPageNum(int finishPageNum) {
		this.finishPageNum = finishPageNum;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	
	
	
	private void calculate() {
		totalPage = (amount -1) / perPage + 1;
		startNum = (curPage -1) * perPage + 1;
		endNum = curPage * perPage;
		if(endNum > amount) {
			endNum = amount;
		}
		//amount150  curpage 5 
		beginPageNum = ((curPage-1)/perLine)*perLine +1;
		finishPageNum = beginPageNum + perLine -1;
		
		if(finishPageNum > totalPage) {
			finishPageNum = totalPage;
		}
	}
	
	
	
}
