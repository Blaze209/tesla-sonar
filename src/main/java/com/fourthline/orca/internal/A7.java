package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoRecording;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class A7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DocumentType f24897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Date f24899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Date f24900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f24901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Ql f24902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private VideoRecording f24903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final UUID f24904h;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public A7(DocumentType documentType, String str, Date date, Date date2, List list, Ql ql2, VideoRecording videoRecording, UUID videoUUID) {
        p013kotlin.jvm.internal.s.k(videoUUID, "videoUUID");
        this.f24897a = documentType;
        this.f24898b = str;
        this.f24899c = date;
        this.f24900d = date2;
        this.f24901e = list;
        this.f24902f = ql2;
        this.f24903g = videoRecording;
        this.f24904h = videoUUID;
    }

    private final boolean f() {
        Ql ql2 = this.f24902f;
        if (ql2 != null) {
            return ql2.h();
        }
        return true;
    }

    private final boolean i() {
        DocumentType documentType = this.f24897a;
        int i11 = documentType == null ? -1 : a.$EnumSwitchMapping$0[documentType.ordinal()];
        return (i11 == -1 || i11 == 1 || i11 == 2) ? false : true;
    }

    public final void a(DocumentType documentType) {
        this.f24897a = documentType;
    }

    public final void b(String str) {
        this.f24898b = str;
    }

    public final List c() {
        return this.f24901e;
    }

    public final Date d() {
        return this.f24899c;
    }

    public final Ql e() {
        return this.f24902f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A7)) {
            return false;
        }
        A7 a11 = (A7) obj;
        return this.f24897a == a11.f24897a && p013kotlin.jvm.internal.s.f(this.f24898b, a11.f24898b) && p013kotlin.jvm.internal.s.f(this.f24899c, a11.f24899c) && p013kotlin.jvm.internal.s.f(this.f24900d, a11.f24900d) && p013kotlin.jvm.internal.s.f(this.f24901e, a11.f24901e) && p013kotlin.jvm.internal.s.f(this.f24902f, a11.f24902f) && p013kotlin.jvm.internal.s.f(this.f24903g, a11.f24903g) && p013kotlin.jvm.internal.s.f(this.f24904h, a11.f24904h);
    }

    public final String g() {
        return this.f24898b;
    }

    public final DocumentType h() {
        return this.f24897a;
    }

    public int hashCode() {
        DocumentType documentType = this.f24897a;
        int iHashCode = (documentType == null ? 0 : documentType.hashCode()) * 31;
        String str = this.f24898b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.f24899c;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f24900d;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        List list = this.f24901e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Ql ql2 = this.f24902f;
        int iHashCode6 = (iHashCode5 + (ql2 == null ? 0 : ql2.hashCode())) * 31;
        VideoRecording videoRecording = this.f24903g;
        return ((iHashCode6 + (videoRecording != null ? videoRecording.hashCode() : 0)) * 31) + this.f24904h.hashCode();
    }

    public final boolean j() {
        return i() && a() && AbstractC3669p3.a(this.f24899c) && AbstractC3669p3.a(this.f24901e) && f();
    }

    public final VideoRecording k() {
        return this.f24903g;
    }

    public String toString() {
        return "DocumentBundle(type=" + this.f24897a + ", number=" + this.f24898b + ", issueDate=" + this.f24899c + ", expirationDate=" + this.f24900d + ", images=" + this.f24901e + ", nfc=" + this.f24902f + ", videoRecording=" + this.f24903g + ", videoUUID=" + this.f24904h + ")";
    }

    public final void a(Date date) {
        this.f24900d = date;
    }

    public final void b(Date date) {
        this.f24899c = date;
    }

    public final void a(List list) {
        this.f24901e = list;
    }

    public final Date b() {
        return this.f24900d;
    }

    public final void a(Ql ql2) {
        this.f24902f = ql2;
    }

    public final void a(VideoRecording videoRecording) {
        this.f24903g = videoRecording;
    }

    public final boolean a() {
        String str = this.f24898b;
        if (str != null) {
            return a(str);
        }
        return false;
    }

    private final boolean a(String str) {
        int length;
        return !p013kotlin.text.t.y0(str) && 6 <= (length = str.length()) && length < 17;
    }

    public /* synthetic */ A7(DocumentType documentType, String str, Date date, Date date2, List list, Ql ql2, VideoRecording videoRecording, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : documentType, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : date, (i11 & 8) != 0 ? null : date2, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : ql2, (i11 & 64) != 0 ? null : videoRecording, (i11 & 128) != 0 ? UUID.randomUUID() : uuid);
    }
}
