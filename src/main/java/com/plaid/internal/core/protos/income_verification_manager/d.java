package com.plaid.internal.core.protos.income_verification_manager;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes6.dex */
public enum d implements Internal.EnumLite {
    UPLOAD_FILE_TYPE_NONE(0),
    UPLOAD_FILE_TYPE_PDF(1),
    UPLOAD_FILE_TYPE_PNG(2),
    UPLOAD_FILE_TYPE_JPEG(3),
    UPLOAD_FILE_TYPE_BMP(4),
    UPLOAD_FILE_TYPE_TIFF(5),
    UPLOAD_FILE_TYPE_GIF(6),
    UNRECOGNIZED(-1);

    public static final int UPLOAD_FILE_TYPE_BMP_VALUE = 4;
    public static final int UPLOAD_FILE_TYPE_GIF_VALUE = 6;
    public static final int UPLOAD_FILE_TYPE_JPEG_VALUE = 3;
    public static final int UPLOAD_FILE_TYPE_NONE_VALUE = 0;
    public static final int UPLOAD_FILE_TYPE_PDF_VALUE = 1;
    public static final int UPLOAD_FILE_TYPE_PNG_VALUE = 2;
    public static final int UPLOAD_FILE_TYPE_TIFF_VALUE = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46963b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46965a;

    public class a implements Internal.EnumLiteMap<d> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i11) {
            return d.forNumber(i11);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46966a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i11) {
            return d.forNumber(i11) != null;
        }
    }

    d(int i11) {
        this.f46965a = i11;
    }

    public static d forNumber(int i11) {
        switch (i11) {
            case 0:
                return UPLOAD_FILE_TYPE_NONE;
            case 1:
                return UPLOAD_FILE_TYPE_PDF;
            case 2:
                return UPLOAD_FILE_TYPE_PNG;
            case 3:
                return UPLOAD_FILE_TYPE_JPEG;
            case 4:
                return UPLOAD_FILE_TYPE_BMP;
            case 5:
                return UPLOAD_FILE_TYPE_TIFF;
            case 6:
                return UPLOAD_FILE_TYPE_GIF;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<d> internalGetValueMap() {
        return f46963b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f46966a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46965a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static d valueOf(int i11) {
        return forNumber(i11);
    }
}
