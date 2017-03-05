package com.niit.collaboration.DAO;

import java.util.List;

import com.niit.collaboration.model.BlogComment;

public interface BlogCommentDAO

{
	
	public boolean addBlogComment(BlogComment blogComment);

	public boolean deleteComment(BlogComment blogComment);
	
	public List<BlogComment> getBlogComments(int blog_id);
}