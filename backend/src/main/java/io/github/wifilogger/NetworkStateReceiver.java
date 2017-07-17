package io.github.wifilogger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetworkStateReceiver  extends BroadcastReceiver {
  private static final Logger log = LoggerFactory.getLogger(NetworkStateReceiver.class);

  @Override
  public void onReceive(Context context, Intent intent) {
    if (intent.getAction().equals(WifiManager.NETWORK_STATE_CHANGED_ACTION)) {
      NetworkInfo networkInfo = intent.getParcelableExtra(WifiManager.EXTRA_NETWORK_INFO);

      log.debug("Wifi state: {}", networkInfo.getState().name());
    }
  }
}
