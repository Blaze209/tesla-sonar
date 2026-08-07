package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import gj.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z11) {
            this.hasAlpha = z11;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int i11 = a.f20510a[ordinal()];
            return i11 == 1 || i11 == 2 || i11 == 3;
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20510a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f20510a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20510a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20510a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    int a(@NonNull ByteBuffer byteBuffer, @NonNull b bVar);

    @NonNull
    ImageType b(@NonNull InputStream inputStream);

    @NonNull
    ImageType c(@NonNull ByteBuffer byteBuffer);

    int d(@NonNull InputStream inputStream, @NonNull b bVar);
}
