package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: com.fourthline.vision.internal.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4149a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4149a4 f38137a = new C4149a4();

    /* JADX INFO: renamed from: com.fourthline.vision.internal.a4$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f38138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f38139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f38140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Long f38141d;

        public a(int i11, int i12, b startTrigger, Long l11) {
            p013kotlin.jvm.internal.s.k(startTrigger, "startTrigger");
            this.f38138a = i11;
            this.f38139b = i12;
            this.f38140c = startTrigger;
            this.f38141d = l11;
        }

        public static /* synthetic */ a copy$default(a aVar, int i11, int i12, b bVar, Long l11, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = aVar.f38138a;
            }
            if ((i13 & 2) != 0) {
                i12 = aVar.f38139b;
            }
            if ((i13 & 4) != 0) {
                bVar = aVar.f38140c;
            }
            if ((i13 & 8) != 0) {
                l11 = aVar.f38141d;
            }
            return aVar.copy(i11, i12, bVar, l11);
        }

        public final int component1() {
            return this.f38138a;
        }

        public final int component2() {
            return this.f38139b;
        }

        public final b component3() {
            return this.f38140c;
        }

        public final Long component4() {
            return this.f38141d;
        }

        public final a copy(int i11, int i12, b startTrigger, Long l11) {
            p013kotlin.jvm.internal.s.k(startTrigger, "startTrigger");
            return new a(i11, i12, startTrigger, l11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f38138a == aVar.f38138a && this.f38139b == aVar.f38139b && this.f38140c == aVar.f38140c && p013kotlin.jvm.internal.s.f(this.f38141d, aVar.f38141d);
        }

        public final int getStartRecordingStepIndex() {
            return this.f38139b;
        }

        public final b getStartTrigger() {
            return this.f38140c;
        }

        public final Long getStopAfterSeconds() {
            return this.f38141d;
        }

        public final int getTotalSteps() {
            return this.f38138a;
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.f38138a) * 31) + Integer.hashCode(this.f38139b)) * 31) + this.f38140c.hashCode()) * 31;
            Long l11 = this.f38141d;
            return iHashCode + (l11 == null ? 0 : l11.hashCode());
        }

        public final boolean requiresRecordingOnStartStep(int i11) {
            return this.f38140c == b.StartOfStep && this.f38139b == i11;
        }

        public final boolean requiresRecordingOnTakePhoto(int i11) {
            return this.f38140c == b.TakePhotoClicked && this.f38139b == i11;
        }

        public String toString() {
            return "RecordingPlan(totalSteps=" + this.f38138a + ", startRecordingStepIndex=" + this.f38139b + ", startTrigger=" + this.f38140c + ", stopAfterSeconds=" + this.f38141d + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.a4$b */
    public enum b {
        StartOfStep,
        TakePhotoClicked,
        RecordDisabled;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f38146e = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return f38146e;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.a4$c */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private C4149a4() {
    }

    private final int decidePaperIdStepsCount(boolean z11) {
        return z11 ? 6 : 3;
    }

    public static /* synthetic */ a getRecordingPlan$default(C4149a4 c4149a4, DocumentType documentType, boolean z11, Long l11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        return c4149a4.getRecordingPlan(documentType, z11, l11);
    }

    public final a getRecordingPlan(DocumentType documentType, boolean z11, Long l11) {
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        switch (c.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
                return z11 ? new a(2, 0, b.TakePhotoClicked, l11) : new a(1, 0, b.StartOfStep, l11);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return z11 ? new a(4, 1, b.TakePhotoClicked, l11) : new a(2, 0, b.TakePhotoClicked, l11);
            case 7:
                return new a(decidePaperIdStepsCount(z11), 0, b.TakePhotoClicked, l11);
            case 8:
            case 9:
                return new a(1, -1, b.RecordDisabled, 0L);
            default:
                throw new IllegalArgumentException("Unsupported or undefined document type: " + documentType);
        }
    }
}
