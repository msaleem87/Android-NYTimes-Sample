
package android.databinding;
import com.nytimes.articles.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.nytimes.articles.R.layout.activity_main:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_main_0".equals(tag)) {
                            return new com.nytimes.articles.databinding.ActivityMainBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
                }
                case com.nytimes.articles.R.layout.item_article_list:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_article_list_0".equals(tag)) {
                            return new com.nytimes.articles.databinding.ItemArticleListBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_article_list is invalid. Received: " + tag);
                }
                case com.nytimes.articles.R.layout.fragment_list_articles:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/fragment_list_articles_0".equals(tag)) {
                            return new com.nytimes.articles.databinding.FragmentListArticlesBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for fragment_list_articles is invalid. Received: " + tag);
                }
                case com.nytimes.articles.R.layout.fragment_article_details:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/fragment_article_details_0".equals(tag)) {
                            return new com.nytimes.articles.databinding.FragmentArticleDetailsBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for fragment_article_details is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.nytimes.articles.R.layout.activity_main;
                }
                break;
            }
            case 996869247: {
                if(tag.equals("layout/item_article_list_0")) {
                    return com.nytimes.articles.R.layout.item_article_list;
                }
                break;
            }
            case -992494523: {
                if(tag.equals("layout/fragment_list_articles_0")) {
                    return com.nytimes.articles.R.layout.fragment_list_articles;
                }
                break;
            }
            case 156321600: {
                if(tag.equals("layout/fragment_article_details_0")) {
                    return com.nytimes.articles.R.layout.fragment_article_details;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"article"
            ,"articleDetailViewModel"
            ,"resource"};
    }
}