package com.teslamotors.tesla.notification;

import com.wix.reactnativenotifications.oem.EmptyOemPushInterface;
import lj0.a;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/teslamotors/tesla/notification/OemPushInjector;", "", "<init>", "()V", "Llj0/a;", "inject", "()Llj0/a;", "react-native-notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OemPushInjector {
    public static final OemPushInjector INSTANCE = new OemPushInjector();

    private OemPushInjector() {
    }

    public static final a inject() {
        return EmptyOemPushInterface.INSTANCE;
    }
}
