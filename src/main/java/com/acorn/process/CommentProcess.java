package com.acorn.process;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acorn.repository.CommentRepository;
import com.acorn.repository.EateriesRepository;
import com.acorn.repository.MembersMainRepository;

@Service
public class CommentProcess {
	@Autowired private CommentRepository commentRepository;
	@Autowired private MembersMainRepository memberRepository;
	@Autowired private EateriesRepository eateryRepository;
	
	// Create
	
	// Read
	
	// Update
	
	// Delete
}