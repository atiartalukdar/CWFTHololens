package info.androidhive.tabsswipe;

import android.content.Context;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class BeatsFragment extends Fragment  implements View.OnClickListener {
	private MediaPlayer mp;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_beats, container, false);
		Button sleep = (Button) rootView.findViewById(R.id.button);
		Button relax = (Button) rootView.findViewById(R.id.button2);
		Button focus = (Button) rootView.findViewById(R.id.button3);
		Button medi = (Button) rootView.findViewById(R.id.button4);
		sleep.setOnClickListener(this);
		relax.setOnClickListener(this);
		focus.setOnClickListener(this);
		medi.setOnClickListener(this);
		return rootView;
	}

	@Override
	public void onClick(View view) {
		int resID=R.raw.sleep;
		switch (view.getId()) {
			case R.id.button:
				Toast.makeText(getActivity(), "Sleeping Beats", Toast.LENGTH_SHORT).show();
				resID = R.raw.sleep;
				break;
			case R.id.button2:
				Toast.makeText(getActivity(), "Relaxation Beats", Toast.LENGTH_SHORT).show();
				resID = R.raw.sleep;
				break;
			case R.id.button3:
				Toast.makeText(getActivity(), "Focus Beats", Toast.LENGTH_SHORT).show();
				resID = R.raw.sleep;
				break;
			case R.id.button4:
				Toast.makeText(getActivity(), "Meditation Beats", Toast.LENGTH_SHORT).show();
				resID = R.raw.sleep;
				break;
			default:

				//Log.i(TAG, "Unknown: " + view.getId());
				break;
		}
		// Release any resources from previous MediaPlayer
		if (mp != null) {
			mp.release();
		}
		// Create a new MediaPlayer to play this sound
		mp = MediaPlayer.create(getActivity(), resID);
		mp.start();
	}

	@Override
	public void onDestroy() {
		if(null!=mp){
			mp.release();
		}
		super.onDestroy();
	}


}
