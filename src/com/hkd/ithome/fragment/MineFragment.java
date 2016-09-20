package com.hkd.ithome.fragment;import com.example.ithome.R;import com.hkd.ithome.activities.Me_Ithome;import com.hkd.ithome.activities.Me_Login;import com.hkd.ithome.activities.Me_Setting;import com.hkd.ithome.activities.Me_Theme;import com.lidroid.xutils.ViewUtils;import com.lidroid.xutils.view.annotation.ViewInject;import com.lidroid.xutils.view.annotation.event.OnClick;import android.content.Intent;import android.os.Bundle;import android.support.v4.app.Fragment;import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import android.widget.ImageView;import android.widget.LinearLayout;import android.widget.TextView;public class MineFragment extends Fragment {	@ViewInject(R.id.Login_My)	ImageView login_my;	@ViewInject(R.id.Login_Message)	TextView login_message;	@ViewInject(R.id.Login_prompt)	TextView login_prompt;	@ViewInject(R.id.Theme)	LinearLayout theme;	@ViewInject(R.id.Setting)	LinearLayout setting;	@ViewInject(R.id.ItHome)	LinearLayout ithome;	@Override	public View onCreateView(LayoutInflater inflater, ViewGroup container,			Bundle savedInstanceState) {		View v = inflater.inflate(R.layout.fragment_mine, null);		ViewUtils.inject(this, v);		return v;	}	@OnClick({ R.id.Login_My, R.id.Login_Message, R.id.Theme, R.id.Setting,			R.id.ItHome })	public void onclick(View v) {		Intent intent;		switch (v.getId()) {		case R.id.Login_My:			intent = new Intent(getActivity(), Me_Login.class);			startActivity(intent);			break;		case R.id.Login_Message:			intent = new Intent(getActivity(), Me_Login.class);			startActivity(intent);			break;		case R.id.Theme:			intent = new Intent(getActivity(), Me_Theme.class);			startActivity(intent);			break;		case R.id.Setting:			intent = new Intent(getActivity(), Me_Setting.class);			startActivity(intent);			break;		case R.id.ItHome:			intent = new Intent(getActivity(), Me_Ithome.class);			startActivity(intent);			break;		default:			break;		}	}	public void setMenuVisibility(boolean menuVisible) {		// TODO Auto-generated method stub		super.setMenuVisibility(menuVisible);		if (this.getView() != null)			this.getView()					.setVisibility(menuVisible ? View.VISIBLE : View.GONE);	}}