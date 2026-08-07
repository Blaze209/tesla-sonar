package com.withpersona.sdk2.inquiry.network.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
public final class GenericFileUploadErrorResponse {
    public static final Companion Companion = new Companion(null);
    private final List<DocumentErrorResponse> errors;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h.e getAdapter() {
            return u20.b.b(DocumentErrorResponse.class, "code").e(DocumentErrorResponse.DisabledFileTypeError.class, "document-generic-disabled-file-type-error").e(DocumentErrorResponse.FileLimitExceededError.class, "document-generic-file-limit-exceeded-error").e(DocumentErrorResponse.PageLimitExceededError.class, "document-generic-page-limit-exceeded-error").e(DocumentErrorResponse.MalformedFileError.class, "document-generic-malformed-file-error").e(DocumentErrorResponse.MalformedImageError.class, "document-generic-malformed-image-error").e(DocumentErrorResponse.MalformedPdfError.class, "document-generic-malformed-pdf-error").e(DocumentErrorResponse.GovernmentIdDimensionSizeError.class, "document-government-id-dimension-size-error").d(UnknownErrorAdapter.INSTANCE);
        }

        private Companion() {
        }
    }

    public static abstract class DocumentErrorResponse implements Parcelable {

        @i(generateAdapter = true)
        public static final class DisabledFileTypeError extends DocumentErrorResponse {
            public static final Parcelable.Creator<DisabledFileTypeError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<DisabledFileTypeError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisabledFileTypeError createFromParcel(Parcel parcel) {
                    return new DisabledFileTypeError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisabledFileTypeError[] newArray(int i11) {
                    return new DisabledFileTypeError[i11];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();
                private final List<String> enabledFileTypes;
                private final String uploadedFileType;

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        return new Details(parcel.readString(), parcel.createStringArrayList());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i11) {
                        return new Details[i11];
                    }
                }

                public Details(@g(name = "uploaded_file_type") String str, @g(name = "enabled_file_types") List<String> list) {
                    this.uploadedFileType = str;
                    this.enabledFileTypes = list;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final List<String> getEnabledFileTypes() {
                    return this.enabledFileTypes;
                }

                public final String getUploadedFileType() {
                    return this.uploadedFileType;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i11) {
                    parcel.writeString(this.uploadedFileType);
                    parcel.writeStringList(this.enabledFileTypes);
                }
            }

            public DisabledFileTypeError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i11);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class FileLimitExceededError extends DocumentErrorResponse {
            public static final Parcelable.Creator<FileLimitExceededError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<FileLimitExceededError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FileLimitExceededError createFromParcel(Parcel parcel) {
                    return new FileLimitExceededError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FileLimitExceededError[] newArray(int i11) {
                    return new FileLimitExceededError[i11];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i11) {
                        return new Details[i11];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i11) {
                    parcel.writeInt(1);
                }
            }

            public FileLimitExceededError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i11);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class GovernmentIdDimensionSizeError extends DocumentErrorResponse {
            public static final Parcelable.Creator<GovernmentIdDimensionSizeError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<GovernmentIdDimensionSizeError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GovernmentIdDimensionSizeError createFromParcel(Parcel parcel) {
                    return new GovernmentIdDimensionSizeError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GovernmentIdDimensionSizeError[] newArray(int i11) {
                    return new GovernmentIdDimensionSizeError[i11];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();
                private final int maxDimensionSize;
                private final int minDimensionSize;

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        return new Details(parcel.readInt(), parcel.readInt());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i11) {
                        return new Details[i11];
                    }
                }

                public Details(@g(name = "min_dimension_size") int i11, @g(name = "max_dimension_size") int i12) {
                    this.minDimensionSize = i11;
                    this.maxDimensionSize = i12;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final int getMaxDimensionSize() {
                    return this.maxDimensionSize;
                }

                public final int getMinDimensionSize() {
                    return this.minDimensionSize;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i11) {
                    parcel.writeInt(this.minDimensionSize);
                    parcel.writeInt(this.maxDimensionSize);
                }
            }

            public GovernmentIdDimensionSizeError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i11);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class MalformedFileError extends DocumentErrorResponse {
            public static final Parcelable.Creator<MalformedFileError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<MalformedFileError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedFileError createFromParcel(Parcel parcel) {
                    return new MalformedFileError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedFileError[] newArray(int i11) {
                    return new MalformedFileError[i11];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i11) {
                        return new Details[i11];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i11) {
                    parcel.writeInt(1);
                }
            }

            public MalformedFileError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i11);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class MalformedImageError extends DocumentErrorResponse {
            public static final Parcelable.Creator<MalformedImageError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<MalformedImageError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedImageError createFromParcel(Parcel parcel) {
                    return new MalformedImageError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedImageError[] newArray(int i11) {
                    return new MalformedImageError[i11];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i11) {
                        return new Details[i11];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i11) {
                    parcel.writeInt(1);
                }
            }

            public MalformedImageError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i11);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class MalformedPdfError extends DocumentErrorResponse {
            public static final Parcelable.Creator<MalformedPdfError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<MalformedPdfError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedPdfError createFromParcel(Parcel parcel) {
                    return new MalformedPdfError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedPdfError[] newArray(int i11) {
                    return new MalformedPdfError[i11];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i11) {
                        return new Details[i11];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i11) {
                    parcel.writeInt(1);
                }
            }

            public MalformedPdfError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i11);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class PageLimitExceededError extends DocumentErrorResponse {
            public static final Parcelable.Creator<PageLimitExceededError> CREATOR = new Creator();
            private final String code;
            private final Details details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<PageLimitExceededError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PageLimitExceededError createFromParcel(Parcel parcel) {
                    return new PageLimitExceededError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PageLimitExceededError[] newArray(int i11) {
                    return new PageLimitExceededError[i11];
                }
            }

            @i(generateAdapter = true)
            public static final class Details implements ErrorDetails {
                public static final Parcelable.Creator<Details> CREATOR = new Creator();
                private final int pageLimit;

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        return new Details(parcel.readInt());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i11) {
                        return new Details[i11];
                    }
                }

                public Details(@g(name = "page_limit") int i11) {
                    this.pageLimit = i11;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final int getPageLimit() {
                    return this.pageLimit;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i11) {
                    parcel.writeInt(this.pageLimit);
                }
            }

            public PageLimitExceededError(String str, String str2, Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i11);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public Details getDetails() {
                return this.details;
            }
        }

        @i(generateAdapter = true)
        public static final class UnknownError extends DocumentErrorResponse {
            public static final Parcelable.Creator<UnknownError> CREATOR = new Creator();
            private final String code;
            private final ErrorDetails details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<UnknownError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnknownError createFromParcel(Parcel parcel) {
                    return new UnknownError(parcel.readString(), parcel.readString(), (ErrorDetails) parcel.readParcelable(UnknownError.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnknownError[] newArray(int i11) {
                    return new UnknownError[i11];
                }
            }

            public UnknownError() {
                this(null, null, null, 7, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public ErrorDetails getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                parcel.writeParcelable(this.details, i11);
            }

            public /* synthetic */ UnknownError(String str, String str2, ErrorDetails errorDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? "Unknown Error" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : errorDetails);
            }

            public UnknownError(String str, String str2, ErrorDetails errorDetails) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = errorDetails;
            }
        }

        public /* synthetic */ DocumentErrorResponse(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getCode();

        public abstract ErrorDetails getDetails();

        public abstract String getTitle();

        private DocumentErrorResponse() {
        }
    }

    public static final class UnknownErrorAdapter extends h<DocumentErrorResponse.UnknownError> {
        public static final UnknownErrorAdapter INSTANCE = new UnknownErrorAdapter();

        private UnknownErrorAdapter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.h
        public DocumentErrorResponse.UnknownError fromJson(k kVar) {
            kVar.h();
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            while (kVar.hasNext()) {
                String strL = kVar.L();
                if (s.f(strL, "title")) {
                    strNextStringOrNull = JsonReaderUtilsKt.nextStringOrNull(kVar);
                } else if (s.f(strL, "code")) {
                    strNextStringOrNull2 = JsonReaderUtilsKt.nextStringOrNull(kVar);
                } else {
                    kVar.F();
                }
            }
            kVar.j();
            if (strNextStringOrNull == null) {
                strNextStringOrNull = "Unknown Error";
            }
            return new DocumentErrorResponse.UnknownError(strNextStringOrNull, strNextStringOrNull2, null, 4, null);
        }

        @Override // com.squareup.moshi.h
        public void toJson(r rVar, DocumentErrorResponse.UnknownError unknownError) {
            rVar.o();
            rVar.b0("title");
            rVar.G0(unknownError != null ? unknownError.getTitle() : null);
            rVar.b0("code");
            rVar.G0(unknownError != null ? unknownError.getCode() : null);
            rVar.C();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenericFileUploadErrorResponse(List<? extends DocumentErrorResponse> list) {
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericFileUploadErrorResponse copy$default(GenericFileUploadErrorResponse genericFileUploadErrorResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = genericFileUploadErrorResponse.errors;
        }
        return genericFileUploadErrorResponse.copy(list);
    }

    public final List<DocumentErrorResponse> component1() {
        return this.errors;
    }

    public final GenericFileUploadErrorResponse copy(List<? extends DocumentErrorResponse> list) {
        return new GenericFileUploadErrorResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericFileUploadErrorResponse) && s.f(this.errors, ((GenericFileUploadErrorResponse) obj).errors);
    }

    public final List<DocumentErrorResponse> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        return this.errors.hashCode();
    }

    public String toString() {
        return "GenericFileUploadErrorResponse(errors=" + this.errors + ")";
    }
}
