package com.fourthline.orca.internal;

import java.util.Arrays;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3371i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f32426a = new a(null);

    /* JADX INFO: renamed from: com.fourthline.orca.internal.i4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final InterfaceC4044xs a(InterfaceC3863tk navigationChannel, InterfaceC3051ak mainRepository, InterfaceC3997wo orcaDestroyer, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        Cs[] csArr = (Cs[]) AbstractC3412j4.a(navigationChannel, orcaDestroyer, mainRepository, imageServiceLocator).toArray(new Cs[0]);
        return popupHandlerBuilder.a((Cs[]) Arrays.copyOf(csArr, csArr.length));
    }
}
