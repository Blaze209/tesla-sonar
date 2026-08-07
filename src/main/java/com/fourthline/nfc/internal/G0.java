package com.fourthline.nfc.internal;

import android.nfc.NfcAdapter;
import com.fourthline.core.location.LocationProvider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public interface G0 extends NfcAdapter.ReaderCallback, CoroutineScope {
    LocationProvider a();
}
