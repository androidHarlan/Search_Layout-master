package scut.carson_ho.search_layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import scut.carson_ho.searchview.ICallBack;
import scut.carson_ho.searchview.SearchButton;
import scut.carson_ho.searchview.SearchView;
import scut.carson_ho.searchview.bCallBack;

/**
 * Created by Carson_Ho on 17/8/11.
 */

public class SearchDemo extends AppCompatActivity implements ICallBack{

    // 1. 初始化搜索框变量
    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 2. 绑定视图
        setContentView(R.layout.activity_search);

        // 3. 绑定组件
        searchView = (SearchView) findViewById(R.id.search_view);

        // 4. 设置点击搜索按键后的操作（通过回调接口）
        // 参数 = 搜索框输入的内容
        searchView.setOnClickSearch(this);

        // 5. 设置点击返回按键后的操作（通过回调接口）
        searchView.setOnClickBack(new bCallBack() {
            @Override
            public void BackAciton() {
                finish();
            }
        });
        searchView.setOnClickSearchButton(new SearchButton() {
            @Override
            public void SearchText(String string) {
                Toast.makeText(SearchDemo.this, string,Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public void SearchAciton(String string) {
        Toast.makeText(this, string,Toast.LENGTH_LONG).show();
    }
}