package com.facebook.react.animated;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/animated/b;", "", "<init>", "()V", "child", "Ljn0/h0;", "b", "(Lcom/facebook/react/animated/b;)V", "g", "parent", "c", DateTokenConverter.CONVERTER_KEY, "h", "", "e", "()Ljava/lang/String;", "f", "", "a", "Ljava/util/List;", "children", "", "I", "activeIncomingNodes", "BFSColor", "tag", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public List<b> children;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int activeIncomingNodes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int BFSColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int tag = -1;

    public final void b(b child) {
        p013kotlin.jvm.internal.s.k(child, "child");
        List arrayList = this.children;
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.children = arrayList;
        }
        arrayList.add(child);
        child.c(this);
    }

    public void c(b parent) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
    }

    public void d(b parent) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
    }

    public abstract String e();

    public final String f() {
        String str;
        List<b> list = this.children;
        String strY0 = list != null ? p013kotlin.collections.v.y0(list, " ", null, null, 0, null, null, 62, null) : null;
        String strE = e();
        if (strY0 == null || p013kotlin.text.t.y0(strY0)) {
            str = "";
        } else {
            str = " children: " + strY0;
        }
        return strE + str;
    }

    public final void g(b child) {
        p013kotlin.jvm.internal.s.k(child, "child");
        List<b> list = this.children;
        if (list == null) {
            return;
        }
        child.d(this);
        list.remove(child);
    }

    public void h() {
    }
}
