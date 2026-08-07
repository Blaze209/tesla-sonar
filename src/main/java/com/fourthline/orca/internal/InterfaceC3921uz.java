package com.fourthline.orca.internal;

import p013kotlin.coroutines.Continuation;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3921uz {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.uz$a */
    public static final class a {
        public static void a(InterfaceC3921uz interfaceC3921uz) {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.uz$b */
    public enum b {
        MoveToTheNextStep,
        HandledInternally;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f35976e = on0.a.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private DocumentRecognitionValue f35977a;

        public final DocumentRecognitionValue b() {
            return this.f35977a;
        }

        public final void a(DocumentRecognitionValue c2922Qa) {
            this.f35977a = c2922Qa;
        }
    }

    Object a(C3640ob c3640ob, Gz gz2, Continuation continuation);

    void reset();
}
