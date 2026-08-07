package com.plaid;

import android.content.Intent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityResultManager extends HashMap<Integer, ActivityResultHandler> {
    public void dispatch(int i11, int i12, Intent intent) {
        ActivityResultHandler activityResultHandler = get(Integer.valueOf(i11));
        if (activityResultHandler != null) {
            activityResultHandler.handleActivityResult(i11, i12, intent);
        }
    }
}
