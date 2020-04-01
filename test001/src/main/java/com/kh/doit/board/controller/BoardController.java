package com.kh.doit.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping("moveFB.go")
	public String moveFreeBoard() {
		return "board/freeBoard_list";
	}
	
	@RequestMapping("fbView.go")
	public String moveFreeBoardView() {
		return "board/freeBoard_view";
	}
	
	@RequestMapping("fbWrite.go")
	public String moveFreeBoardWrite() {
		return "board/freeBoard_write";
	}
	
	@RequestMapping("moveBS.go")
	public String moveBookShare() {
		return "board/bookShare_list";
	}
	
	@RequestMapping("bsView.go")
	public String moveBookShareView() {
		return "board/bookShare_view";
		// return "board/bookShare_list"; 어... list ID값 받아와서 이동해야 한다
	}
	
	@RequestMapping("bsInsert.go")
	public String moveBookShareWrite() {
		return "board/bookShare_write";
	}

	@RequestMapping("bsUpdate.go")
	public String moveBookShareUpdate() {
		return "board/bookShare_update";
	}
	
	@RequestMapping("moveNT.go")
	public String moveNotice() {
		return "board/notice_list";
	}
	
	@RequestMapping("ntView.go")
	public String moveNoticeView() {
		return "board/notice_view";
	}
	
	@RequestMapping("ntWrite.go")
	public String moveNoticeWrite() {
		return "board/notice_write";
	}
	
	
}
