package com.facebook.react.devsupport;

import android.content.Context;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/devsupport/y0;", "Lcom/facebook/react/devsupport/h1;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Ljn0/h0;", "z", "()V", "v", "Leo/a;", "b", "Leo/a;", "q", "()Leo/a;", "devSettings", "Lcom/facebook/react/devsupport/k;", "c", "Lcom/facebook/react/devsupport/k;", "devServerHelper", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y0 extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final eo.a devSettings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k devServerHelper;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/facebook/react/devsupport/y0$a", "Lcom/facebook/react/devsupport/j$b;", "Ljn0/h0;", "a", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements j.b {
        a() {
        }

        @Override // com.facebook.react.devsupport.j.b
        public void a() {
        }
    }

    public y0(Context applicationContext) {
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        this.devSettings = new j(applicationContext, new a());
        this.devServerHelper = new k(getDevSettings(), applicationContext, getDevSettings().getPackagerConnectionSettings());
    }

    @Override // com.facebook.react.devsupport.h1, pn.e
    /* JADX INFO: renamed from: q, reason: from getter */
    public eo.a getDevSettings() {
        return this.devSettings;
    }

    @Override // com.facebook.react.devsupport.h1, pn.e
    public void v() {
        this.devServerHelper.i();
    }

    @Override // com.facebook.react.devsupport.h1, pn.e
    public void z() {
        this.devServerHelper.y();
    }
}
