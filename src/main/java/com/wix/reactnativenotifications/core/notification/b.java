package com.wix.reactnativenotifications.core.notification;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Bundle f58814a;

    public b(Bundle bundle) {
        this.f58814a = bundle;
    }

    public Bundle a() {
        return com.wix.reactnativenotifications.a.a((Bundle) this.f58814a.clone());
    }

    public boolean b() {
        return this.f58814a.containsKey("google.message_id");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(1024);
        for (String str : this.f58814a.keySet()) {
            sb2.append(str);
            sb2.append("=");
            sb2.append(this.f58814a.get(str));
            sb2.append(", ");
        }
        return sb2.toString();
    }
}
