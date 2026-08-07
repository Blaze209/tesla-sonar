package com.stripe.android.link;

import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import c60.LinkConfiguration;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/stripe/android/link/d;", "", "Lf60/a$a;", "linkAnalyticsComponentBuilder", "Lcom/stripe/android/link/LinkActivityContract;", "linkActivityContract", "Ld60/d;", "linkStore", "<init>", "(Lf60/a$a;Lcom/stripe/android/link/LinkActivityContract;Ld60/d;)V", "Lh/b;", "activityResultCaller", "Lkotlin/Function1;", "Lcom/stripe/android/link/a;", "Ljn0/h0;", "callback", "c", "(Lh/b;Lwn0/l;)V", "e", "()V", "Lc60/c;", "configuration", "b", "(Lc60/c;)V", "a", "Lcom/stripe/android/link/LinkActivityContract;", "Ld60/d;", "Le60/c;", "Le60/c;", "analyticsHelper", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/link/LinkActivityContract$a;", DateTokenConverter.CONVERTER_KEY, "Landroidx/activity/result/ActivityResultLauncher;", "linkActivityResultLauncher", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LinkActivityContract linkActivityContract;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d60.d linkStore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e60.c analyticsHelper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ActivityResultLauncher<LinkActivityContract.Args> linkActivityResultLauncher;

    public d(f60.a.InterfaceC1329a linkAnalyticsComponentBuilder, LinkActivityContract linkActivityContract, d60.d linkStore) {
        s.k(linkAnalyticsComponentBuilder, "linkAnalyticsComponentBuilder");
        s.k(linkActivityContract, "linkActivityContract");
        s.k(linkStore, "linkStore");
        this.linkActivityContract = linkActivityContract;
        this.linkStore = linkStore;
        this.analyticsHelper = linkAnalyticsComponentBuilder.build().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(d this$0, l callback, a aVar) {
        s.k(this$0, "this$0");
        s.k(callback, "$callback");
        e60.c cVar = this$0.analyticsHelper;
        s.h(aVar);
        cVar.c(aVar);
        if (aVar instanceof a.Completed) {
            this$0.linkStore.d();
        }
        callback.invoke(aVar);
    }

    public final void b(LinkConfiguration configuration) {
        s.k(configuration, "configuration");
        LinkActivityContract.Args args = new LinkActivityContract.Args(configuration);
        ActivityResultLauncher<LinkActivityContract.Args> activityResultLauncher = this.linkActivityResultLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.b(args);
        }
        this.analyticsHelper.a();
    }

    public final void c(h.b activityResultCaller, final l<? super a, h0> callback) {
        s.k(activityResultCaller, "activityResultCaller");
        s.k(callback, "callback");
        this.linkActivityResultLauncher = activityResultCaller.registerForActivityResult(this.linkActivityContract, new ActivityResultCallback() { // from class: c60.f
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                com.stripe.android.link.d.d(this.f18814a, callback, (com.stripe.android.link.a) obj);
            }
        });
    }

    public final void e() {
        ActivityResultLauncher<LinkActivityContract.Args> activityResultLauncher = this.linkActivityResultLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.d();
        }
        this.linkActivityResultLauncher = null;
    }
}
