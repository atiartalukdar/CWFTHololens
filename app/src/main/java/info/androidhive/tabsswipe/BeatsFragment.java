package info.androidhive.tabsswipe;

import android.content.DialogInterface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BeatsFragment extends Fragment  implements DialogInterface.OnClickListener{
	private MediaPlayer mp;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_beats, container, false);

		return rootView;
	}


	@Override
	public void onClick(DialogInterface dialog, int which) {

	}
}
