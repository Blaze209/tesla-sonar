package com.fourthline.orca.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: com.fourthline.orca.internal.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3225eo {
    public static final void a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.governikus.ausweisapp2");
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268435456);
            context.startActivity(launchIntentForPackage);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.governikus.ausweisapp2"));
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.governikus.ausweisapp2"));
            intent2.addFlags(268435456);
            context.startActivity(intent2);
        }
    }
}
