//package xyz.leeyangy.Blog.service;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import xyz.leeyangy.Blog.domain.Blog;
//import xyz.leeyangy.Blog.domain.blogQuery;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author LEEYANGY
// * @date 2022/6/22 1:28
// */
//
//public interface blogService {
//    Blog getBlog(Long id);
//
//    Blog getAndConvert(Long id);
//
//    Page<Blog> listBlog(Pageable pageable, blogQuery Blog);
//
//    Page<Blog> listBlog(Pageable pageable);
//
//    Page<Blog> listBlog(String query, Pageable pageable);
//
//    Page<Blog> listBlog(Long tagId, Pageable pageable);
//
//    List<Blog> listRecommendBlogTop(Integer size);
//
//    // 归档页
//    Map<String, List<Blog>> archiveBlog();
//
//    Long countBlog();
//
//    Blog saveBlog(Blog Blog);
//
//    Blog updateBlog(Long id, Blog Blog);
//
//    void deleteBlog(Long id);
//
//    void updateViews(Long id);
//}
