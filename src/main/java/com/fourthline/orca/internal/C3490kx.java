package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.location.Coordinate;
import java.util.UUID;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3490kx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f33107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f33108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Coordinate f33109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VideoRecording f33110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final UUID f33111e;

    public C3490kx(Bitmap bitmap, Long l11, Coordinate coordinate, VideoRecording videoRecording, UUID videoUUID) {
        p013kotlin.jvm.internal.s.k(videoUUID, "videoUUID");
        this.f33107a = bitmap;
        this.f33108b = l11;
        this.f33109c = coordinate;
        this.f33110d = videoRecording;
        this.f33111e = videoUUID;
    }

    private final boolean b() {
        return this.f33107a != null;
    }

    public final Bitmap a() {
        return this.f33107a;
    }

    public final Coordinate c() {
        return this.f33109c;
    }

    public final Long d() {
        return this.f33108b;
    }

    public final boolean e() {
        return b() && AbstractC3669p3.a(this.f33108b) && AbstractC3669p3.a(this.f33109c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3490kx)) {
            return false;
        }
        C3490kx c3490kx = (C3490kx) obj;
        return p013kotlin.jvm.internal.s.f(this.f33107a, c3490kx.f33107a) && p013kotlin.jvm.internal.s.f(this.f33108b, c3490kx.f33108b) && p013kotlin.jvm.internal.s.f(this.f33109c, c3490kx.f33109c) && p013kotlin.jvm.internal.s.f(this.f33110d, c3490kx.f33110d) && p013kotlin.jvm.internal.s.f(this.f33111e, c3490kx.f33111e);
    }

    public final VideoRecording f() {
        return this.f33110d;
    }

    public int hashCode() {
        Bitmap bitmap = this.f33107a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Long l11 = this.f33108b;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Coordinate coordinate = this.f33109c;
        int iHashCode3 = (iHashCode2 + (coordinate == null ? 0 : coordinate.hashCode())) * 31;
        VideoRecording videoRecording = this.f33110d;
        return ((iHashCode3 + (videoRecording != null ? videoRecording.hashCode() : 0)) * 31) + this.f33111e.hashCode();
    }

    public String toString() {
        return "SelfieAttachmentBundle(image=" + this.f33107a + ", timestamp=" + this.f33108b + ", location=" + this.f33109c + ", videoRecording=" + this.f33110d + ", videoUUID=" + this.f33111e + ")";
    }

    public final void a(Bitmap bitmap) {
        this.f33107a = bitmap;
    }

    public final void a(Long l11) {
        this.f33108b = l11;
    }

    public final void a(Coordinate coordinate) {
        this.f33109c = coordinate;
    }

    public final void a(VideoRecording videoRecording) {
        this.f33110d = videoRecording;
    }

    public /* synthetic */ C3490kx(Bitmap bitmap, Long l11, Coordinate coordinate, VideoRecording videoRecording, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bitmap, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : coordinate, (i11 & 8) != 0 ? null : videoRecording, (i11 & 16) != 0 ? UUID.randomUUID() : uuid);
    }
}
