package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Tq {

    public static final class a implements InterfaceC3059as {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f27962a;

        a(C3058ar c3058ar) {
            List supportedDocuments = c3058ar.getSupportedDocuments();
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(supportedDocuments, 10));
            Iterator it = supportedDocuments.iterator();
            while (it.hasNext()) {
                arrayList.add(((PoaDocumentTypeConfig) it.next()).getId());
            }
            this.f27962a = arrayList;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3059as
        public List a() {
            return this.f27962a;
        }
    }

    public static final class b implements InterfaceC3102bs {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3528ls f27963a;

        b(C3528ls c3528ls) {
            this.f27963a = c3528ls;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3102bs
        public void a(URI uri) {
            p013kotlin.jvm.internal.s.k(uri, "uri");
            this.f27963a.a(new InterfaceC3272fs.a(uri));
        }

        @Override // com.fourthline.orca.internal.InterfaceC3102bs
        public void a(Bitmap image) {
            p013kotlin.jvm.internal.s.k(image, "image");
            this.f27963a.a(new InterfaceC3272fs.b(image));
        }
    }

    public final InterfaceC3102bs a(C3528ls dataBundle) {
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        return new b(dataBundle);
    }

    public final InterfaceC3858tf a(C3497l3 decoderFromUri) {
        p013kotlin.jvm.internal.s.k(decoderFromUri, "decoderFromUri");
        return new C3400is(decoderFromUri);
    }

    public final C3186ds a(InterfaceC3059as repository, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3186ds(repository, imageServiceLocator);
    }

    public final InterfaceC3059as a(C3058ar flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        return new a(flowConfig);
    }

    public final C3229es a(Ur analytics, C3101br flowCoordinator, C3497l3 bitmapDecoderFromUri, C3944vf fileWriterFromUri, InterfaceC3102bs resultRepository, CoroutineScope coroutineScope, InterfaceC3858tf fileValidator, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator, C3186ds stateProvider) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(bitmapDecoderFromUri, "bitmapDecoderFromUri");
        p013kotlin.jvm.internal.s.k(fileWriterFromUri, "fileWriterFromUri");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(fileValidator, "fileValidator");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        return new C3229es(new C3520lk(stateProvider), new C2874Gc(coroutineScope), flowCoordinator, resultRepository, bitmapDecoderFromUri, fileWriterFromUri, stateProvider, analytics, popupHandlerBuilder.a(new Xr(flowCoordinator, analytics, imageServiceLocator), new Zr(imageServiceLocator), new Yr(imageServiceLocator)), fileValidator, coroutineScope);
    }
}
