package com.javaex.ex02;

import java.util.List;

public class AuthorApp {

	public static void main(String[] args) {

		//authorDao.authorInsert("김영하", "알쓸신잡");
		


			/*
			int dCount = authorDao.authorDelete(4);
			System.out.println("삭제건수:" + dCount );
			*/
	
			/*
			int uCount = authorDao.authorUpdate(1, "이문열", "삼국지 작가");
			System.out.println("수정건수:" + uCount );
			*/
	
			List<AuthorVo> authorList = authorDao.authorSelect();
			for(int i=0; i<authorList.size(); i++) {

			/*
			int authorId = authorList.get(i).getAuthorId();
			String authorName = authorList.get(i).getAuthorName();
			String authorDesc = authorList.get(i).getAuthorDesc();
			
			System.out.println(authorId + ", " + authorName + ", " +  authorDesc);
			*/


			AuthorVo authorVo = authorList.get(i);
			System.out.println(authorVo.getAuthorId() + ", " + 
			                   authorVo.getAuthorName() + ", " +
					           authorVo.getAuthorDesc() );



			/*
			System.out.println(authorList.get(i).getAuthorId() + ", " + 
					           authorList.get(i).getAuthorName() + ", " + 
					           authorList.get(i).getAuthorDesc());
			*/
		}
}
}
