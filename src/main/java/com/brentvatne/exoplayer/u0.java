package com.brentvatne.exoplayer;

import android.os.Bundle;
import androidx.media3.session.se;
import androidx.media3.session.t7;
import androidx.media3.session.te;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/brentvatne/exoplayer/u0;", "Landroidx/media3/session/t7$d;", "<init>", "()V", "Landroidx/media3/session/t7;", "session", "Landroidx/media3/session/t7$g;", "controller", "Landroidx/media3/session/t7$e;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/media3/session/t7;Landroidx/media3/session/t7$g;)Landroidx/media3/session/t7$e;", "Landroidx/media3/session/se;", "customCommand", "Landroid/os/Bundle;", "args", "Lcom/google/common/util/concurrent/s;", "Lga/v;", "b", "(Landroidx/media3/session/t7;Landroidx/media3/session/t7$g;Landroidx/media3/session/se;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/s;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u0 implements t7.d {
    @Override // androidx.media3.session.t7.d
    public com.google.common.util.concurrent.s<ga.v> b(t7 session, t7.g controller, se customCommand, Bundle args) {
        p013kotlin.jvm.internal.s.k(session, "session");
        p013kotlin.jvm.internal.s.k(controller, "controller");
        p013kotlin.jvm.internal.s.k(customCommand, "customCommand");
        p013kotlin.jvm.internal.s.k(args, "args");
        w0.Companion aVar = w0.INSTANCE;
        String customAction = customCommand.f12348b;
        p013kotlin.jvm.internal.s.j(customAction, "customAction");
        aVar.b(aVar.a(customAction), session);
        com.google.common.util.concurrent.s<ga.v> sVarB = super.b(session, controller, customCommand, args);
        p013kotlin.jvm.internal.s.j(sVarB, "onCustomCommand(...)");
        return sVarB;
    }

    @Override // androidx.media3.session.t7.d
    public t7.e d(t7 session, t7.g controller) {
        p013kotlin.jvm.internal.s.k(session, "session");
        p013kotlin.jvm.internal.s.k(controller, "controller");
        try {
            t7.e.a aVarB = new t7.e.a(session).b(t7.e.f12379j.b().a(12).a(11).f());
            te.b bVarA = t7.e.f12377h.a();
            String stringValue = w0.Companion.EnumC0414a.SEEK_FORWARD.getStringValue();
            Bundle bundle = Bundle.EMPTY;
            t7.e eVarA = aVarB.c(bVarA.a(new se(stringValue, bundle)).a(new se(w0.Companion.EnumC0414a.SEEK_BACKWARD.getStringValue(), bundle)).e()).a();
            p013kotlin.jvm.internal.s.j(eVarA, "build(...)");
            return eVarA;
        } catch (Exception unused) {
            t7.e eVarB = t7.e.b();
            p013kotlin.jvm.internal.s.j(eVarB, "reject(...)");
            return eVarB;
        }
    }
}
