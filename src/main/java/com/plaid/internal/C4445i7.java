package com.plaid.internal;

import com.plaid.internal.link.LinkActivity;
import com.plaid.link.R;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: renamed from: com.plaid.internal.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4445i7 {
    public static final void a(LinkActivity linkActivity) {
        p013kotlin.jvm.internal.s.k(linkActivity, "<this>");
        linkActivity.getWindow().addFlags(Integer.MIN_VALUE);
        linkActivity.getWindow().setStatusBarColor(androidx.core.content.b.getColor(linkActivity, R.color.plaid_full_black_opacity_25));
    }

    public static final void a(androidx.fragment.app.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<this>");
        uVar.getWindow().addFlags(Integer.MIN_VALUE);
        uVar.getWindow().setStatusBarColor(-1);
        uVar.getWindow().getDecorView().setSystemUiVisibility(PKIFailureInfo.certRevoked);
    }
}
