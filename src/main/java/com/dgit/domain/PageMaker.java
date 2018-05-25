package com.dgit.domain;

public class PageMaker {
	private int totalCount;// �Խù� ��ü�� ����
	private int startPage;// ������ ��ȣ�� ���۹�ȣ
	private int endPage;// ������ ��ȣ�� ������ ��ȣ
	private boolean prev;
	private boolean next;

	private int displayPageNum = 10;// �������� ������ ��ȣ�� ����

	private Criteria cri;// ���� ������ ��ȣ�� �˾ƾ� ������ ��ȣ�� ������ �� �� �ִ�.
	
	
	private void calcData() {
		
		//���� �������� �� ��ȣ�� ���Ѵ�.
		//ex)15/10 = > Math.ceil(1.5)->2*10->20
		endPage = (int)(Math.ceil(cri.getPage()/(double)displayPageNum)*displayPageNum);
		
		//���� �������� ���� ��ȣ�� ���Ѵ�.
		//ex)20-10+1=11
		startPage= (endPage-displayPageNum)+1;
		
		
		//��ü ���ù��� 151�̰� ���� �������� 15�϶�,������ end�� 16�� ��Ÿ���� �Ѵ�.
		//Math.ceil(151/10)=16
		int tempEndPage = (int)(Math.ceil(totalCount)/(double)cri.getPerPageNum());
		if(endPage>tempEndPage) {
			endPage=tempEndPage;
		}
		//���� ������ ����
		prev=(startPage==1)?false:true;
		//���� ������ ����
		next=(endPage*cri.getPerPageNum()>=totalCount)?false:true;
		
		
		
	}

	
	

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}

	public Criteria getCri() {
		return cri;
	}

	public void setCri(Criteria cri) {
		this.cri = cri;
	}

	@Override
	public String toString() {
		return "PageMaker [totalCount=" + totalCount + ", startPage=" + startPage + ", endPage=" + endPage + ", prev="
				+ prev + ", next=" + next + ", displayPageNum=" + displayPageNum + ", cri=" + cri + "]";
	}

}
