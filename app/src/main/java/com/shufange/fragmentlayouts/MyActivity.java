package com.shufange.fragmentlayouts;

import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MyActivity extends FragmentActivity {
    private final String[] tvShowInfo = {
            "The Good Wife is an American television legal and political drama that premiered on CBS on September 22, 2009.[1] The series was created by Robert King and Michelle King. It stars Julianna Margulies, Christine Baranski, Archie Panjabi, Matt Czuchry and Alan Cumming, and features Chris Noth in a recurring role. The current executive producers are Ridley Scott, Charles McDougall, and David W. Zucker.",


            "The Big Bang Theory is an American sitcom created by Chuck Lorre and Bill Prady, both of whom serve as executive producers on the show along with Steven Molaro. All three also serve as head writers. It premiered on CBS on September 24, 2007.[5] The eighth season premiered on September 22, 2014.",


            "Suits is a USA Network drama created by Aaron Korsh that stars Patrick J. Adams as Michael \"Mike\" Ross and Gabriel Macht as Harvey Specter. The series is set at Pearson Hardman, a fictional law firm in New York City.",


            "The Shield is an American drama television series starring Michael Chiklis that premiered on March 12, 2002, on FX, in the United States, and concluded on November 25, 2008, after seven seasons. Known for its portrayal of corrupt police officers, it was originally advertised as Rampart in reference to the true life Rampart Division police scandal",


            "2 Broke Girls is an American television sitcom created for Warner Bros. Television by Michael Patrick King and Whitney Cummings. It premiered on CBS in the United States on September 19, 2011, during the 2011–12 television season. On March 27, 2013, CBS announced that 2 Broke Girls has been renewed for a third season, to air during the 2013–14 television season.",


            "Two and a Half Men is an American television sitcom that began broadcast on CBS on September 22, 2003. Starring Charlie Sheen, Jon Cryer, and Angus T. Jones, the show was about a hedonistic jingle writer, Charlie Harper; his uptight brother, Alan; and Alan's growing son, Jake. After Alan divorces, he moves with his son to share Charlie's beach-front Malibu house and complicate Charlie's free-wheeling life.",


            "Anger Management is an American television sitcom that premiered on FX on June 28, 2012.[1] The series has the same name as but is not based on the 2003 film of the same name and stars Charlie Sheen in a role similar to that of Jack Nicholson from the 2003 film."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        int screenOption = getResources().getConfiguration().orientation;

        if(screenOption == Configuration.ORIENTATION_PORTRAIT){
            hideMainPanel();
        }else {

            final View mainPanel = findViewById(R.id.main_panel);
            final TextView tvShowInfoTitle = (TextView) mainPanel.findViewById(R.id.infoTitleTextView);
            final TextView tvShowInfoMainBody = (TextView) mainPanel.findViewById(R.id.infoMainBodyTextView);

            final View sidePanel = findViewById(R.id.side_panel);
            ListView tvShowListView = (ListView) sidePanel.findViewById(R.id.sidePanelListView);
            tvShowListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                    String tvShowPicked = String.valueOf(adapterView.getItemAtPosition(pos));
                    tvShowInfoTitle.setText(tvShowPicked);
                    tvShowInfoMainBody.setText(tvShowInfo[pos]);
                }
            });
        }
    }

    private void hideMainPanel(){
        View mainPanel = findViewById(R.id.main_panel);
        if(mainPanel.getVisibility()==View.VISIBLE){
            mainPanel.setVisibility(View.GONE);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
