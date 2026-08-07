package com.withpersona.sdk2.inquiry.network.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.ResponseBody;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
public final class ErrorResponse {
    public static final Companion Companion = new Companion(null);
    private final List<Error> errors;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorResponse create(String str) {
            return new ErrorResponse(v.e(new Error.UnknownError(str, null)));
        }

        public final h.e getAdapter() {
            return ErrorJsonAdapterFactory.INSTANCE;
        }

        private Companion() {
        }
    }

    public static abstract class Error implements Parcelable {

        @i(generateAdapter = true)
        public static final class FieldNotFoundError extends Error {
            public static final Parcelable.Creator<FieldNotFoundError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<FieldNotFoundError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FieldNotFoundError createFromParcel(Parcel parcel) {
                    return new FieldNotFoundError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FieldNotFoundError[] newArray(int i11) {
                    return new FieldNotFoundError[i11];
                }
            }

            public FieldNotFoundError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ FieldNotFoundError copy$default(FieldNotFoundError fieldNotFoundError, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = fieldNotFoundError.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = fieldNotFoundError.details;
                }
                return fieldNotFoundError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final FieldNotFoundError copy(String str, String str2) {
                return new FieldNotFoundError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FieldNotFoundError)) {
                    return false;
                }
                FieldNotFoundError fieldNotFoundError = (FieldNotFoundError) obj;
                return s.f(this.title, fieldNotFoundError.title) && s.f(this.details, fieldNotFoundError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "FieldNotFoundError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class InactiveTemplateError extends Error {
            public static final Parcelable.Creator<InactiveTemplateError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<InactiveTemplateError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InactiveTemplateError createFromParcel(Parcel parcel) {
                    return new InactiveTemplateError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InactiveTemplateError[] newArray(int i11) {
                    return new InactiveTemplateError[i11];
                }
            }

            public InactiveTemplateError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ InactiveTemplateError copy$default(InactiveTemplateError inactiveTemplateError, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = inactiveTemplateError.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = inactiveTemplateError.details;
                }
                return inactiveTemplateError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final InactiveTemplateError copy(String str, String str2) {
                return new InactiveTemplateError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InactiveTemplateError)) {
                    return false;
                }
                InactiveTemplateError inactiveTemplateError = (InactiveTemplateError) obj;
                return s.f(this.title, inactiveTemplateError.title) && s.f(this.details, inactiveTemplateError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "InactiveTemplateError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class InconsistentTransitionError extends Error {
            public static final Parcelable.Creator<InconsistentTransitionError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<InconsistentTransitionError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InconsistentTransitionError createFromParcel(Parcel parcel) {
                    return new InconsistentTransitionError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InconsistentTransitionError[] newArray(int i11) {
                    return new InconsistentTransitionError[i11];
                }
            }

            public InconsistentTransitionError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ InconsistentTransitionError copy$default(InconsistentTransitionError inconsistentTransitionError, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = inconsistentTransitionError.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = inconsistentTransitionError.details;
                }
                return inconsistentTransitionError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final InconsistentTransitionError copy(String str, String str2) {
                return new InconsistentTransitionError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InconsistentTransitionError)) {
                    return false;
                }
                InconsistentTransitionError inconsistentTransitionError = (InconsistentTransitionError) obj;
                return s.f(this.title, inconsistentTransitionError.title) && s.f(this.details, inconsistentTransitionError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "InconsistentTransitionError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class InvalidConfigError extends Error {
            public static final Parcelable.Creator<InvalidConfigError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<InvalidConfigError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InvalidConfigError createFromParcel(Parcel parcel) {
                    return new InvalidConfigError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InvalidConfigError[] newArray(int i11) {
                    return new InvalidConfigError[i11];
                }
            }

            public InvalidConfigError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ InvalidConfigError copy$default(InvalidConfigError invalidConfigError, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = invalidConfigError.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = invalidConfigError.details;
                }
                return invalidConfigError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final InvalidConfigError copy(String str, String str2) {
                return new InvalidConfigError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvalidConfigError)) {
                    return false;
                }
                InvalidConfigError invalidConfigError = (InvalidConfigError) obj;
                return s.f(this.title, invalidConfigError.title) && s.f(this.details, invalidConfigError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "InvalidConfigError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class InvalidFieldValueError extends Error {
            public static final Parcelable.Creator<InvalidFieldValueError> CREATOR = new Creator();
            private final Map<String, UiComponentError> details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<InvalidFieldValueError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InvalidFieldValueError createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int i11 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                        for (int i12 = 0; i12 != i11; i12++) {
                            linkedHashMap2.put(parcel.readString(), parcel.readParcelable(InvalidFieldValueError.class.getClassLoader()));
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new InvalidFieldValueError(string, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InvalidFieldValueError[] newArray(int i11) {
                    return new InvalidFieldValueError[i11];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public InvalidFieldValueError(String str, Map<String, ? extends UiComponentError> map) {
                super(null);
                this.title = str;
                this.details = map;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                Set<String> setKeySet;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid value(s) on field(s) ");
                Map<String, UiComponentError> map = this.details;
                sb2.append((map == null || (setKeySet = map.keySet()) == null) ? null : v.y0(setKeySet, null, null, null, 0, null, null, 63, null));
                sb2.append(".");
                return sb2.toString();
            }

            public final Map<String, UiComponentError> getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                Map<String, UiComponentError> map = this.details;
                if (map == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeInt(map.size());
                for (Map.Entry<String, UiComponentError> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeParcelable(entry.getValue(), i11);
                }
            }
        }

        @i(generateAdapter = true)
        public static final class RateLimitExceededError extends Error {
            public static final Parcelable.Creator<RateLimitExceededError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<RateLimitExceededError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RateLimitExceededError createFromParcel(Parcel parcel) {
                    return new RateLimitExceededError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RateLimitExceededError[] newArray(int i11) {
                    return new RateLimitExceededError[i11];
                }
            }

            public RateLimitExceededError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ RateLimitExceededError copy$default(RateLimitExceededError rateLimitExceededError, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = rateLimitExceededError.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = rateLimitExceededError.details;
                }
                return rateLimitExceededError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final RateLimitExceededError copy(String str, String str2) {
                return new RateLimitExceededError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RateLimitExceededError)) {
                    return false;
                }
                RateLimitExceededError rateLimitExceededError = (RateLimitExceededError) obj;
                return s.f(this.title, rateLimitExceededError.title) && s.f(this.details, rateLimitExceededError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "RateLimitExceededError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class TransitionFromTerminalStateError extends Error {
            public static final Parcelable.Creator<TransitionFromTerminalStateError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<TransitionFromTerminalStateError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TransitionFromTerminalStateError createFromParcel(Parcel parcel) {
                    return new TransitionFromTerminalStateError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TransitionFromTerminalStateError[] newArray(int i11) {
                    return new TransitionFromTerminalStateError[i11];
                }
            }

            public TransitionFromTerminalStateError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ TransitionFromTerminalStateError copy$default(TransitionFromTerminalStateError transitionFromTerminalStateError, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = transitionFromTerminalStateError.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = transitionFromTerminalStateError.details;
                }
                return transitionFromTerminalStateError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final TransitionFromTerminalStateError copy(String str, String str2) {
                return new TransitionFromTerminalStateError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TransitionFromTerminalStateError)) {
                    return false;
                }
                TransitionFromTerminalStateError transitionFromTerminalStateError = (TransitionFromTerminalStateError) obj;
                return s.f(this.title, transitionFromTerminalStateError.title) && s.f(this.details, transitionFromTerminalStateError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "TransitionFromTerminalStateError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class UnauthenticatedError extends Error {
            public static final Parcelable.Creator<UnauthenticatedError> CREATOR = new Creator();
            private final String details;
            private final String title;

            public static final class Creator implements Parcelable.Creator<UnauthenticatedError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnauthenticatedError createFromParcel(Parcel parcel) {
                    return new UnauthenticatedError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnauthenticatedError[] newArray(int i11) {
                    return new UnauthenticatedError[i11];
                }
            }

            public UnauthenticatedError(String str, String str2) {
                super(null);
                this.title = str;
                this.details = str2;
            }

            public static /* synthetic */ UnauthenticatedError copy$default(UnauthenticatedError unauthenticatedError, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = unauthenticatedError.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = unauthenticatedError.details;
                }
                return unauthenticatedError.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.details;
            }

            public final UnauthenticatedError copy(String str, String str2) {
                return new UnauthenticatedError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UnauthenticatedError)) {
                    return false;
                }
                UnauthenticatedError unauthenticatedError = (UnauthenticatedError) obj;
                return s.f(this.title, unauthenticatedError.title) && s.f(this.details, unauthenticatedError.details);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return this.details;
            }

            public final String getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.details;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "UnauthenticatedError(title=" + this.title + ", details=" + this.details + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.details);
            }
        }

        @i(generateAdapter = true)
        public static final class UnknownError extends Error {
            public static final Parcelable.Creator<UnknownError> CREATOR = new Creator();
            private transient ResponseBody errorBody;
            private final String originalCode;
            private final String title;

            public static final class Creator implements Parcelable.Creator<UnknownError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnknownError createFromParcel(Parcel parcel) {
                    return new UnknownError(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnknownError[] newArray(int i11) {
                    return new UnknownError[i11];
                }
            }

            public UnknownError(String str, String str2) {
                super(null);
                this.title = str;
                this.originalCode = str2;
            }

            public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = unknownError.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = unknownError.originalCode;
                }
                return unknownError.copy(str, str2);
            }

            public static /* synthetic */ void getErrorBody$annotations() {
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.originalCode;
            }

            public final UnknownError copy(String str, String str2) {
                return new UnknownError(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UnknownError)) {
                    return false;
                }
                UnknownError unknownError = (UnknownError) obj;
                return s.f(this.title, unknownError.title) && s.f(this.originalCode, unknownError.originalCode);
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getDescription() {
                return getTitle();
            }

            public final ResponseBody getErrorBody() {
                return this.errorBody;
            }

            public final String getOriginalCode() {
                return this.originalCode;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.originalCode;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final void setErrorBody(ResponseBody responseBody) {
                this.errorBody = responseBody;
            }

            public String toString() {
                return "UnknownError(title=" + this.title + ", originalCode=" + this.originalCode + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeString(this.title);
                parcel.writeString(this.originalCode);
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getDescription();

        public abstract String getTitle();

        private Error() {
        }
    }

    public static final class ErrorJsonAdapterFactory implements h.e {
        public static final ErrorJsonAdapterFactory INSTANCE = new ErrorJsonAdapterFactory();
        private static final String LABEL_KEY = "code";
        private static final u20.b<Error> adapterFactory = u20.b.b(Error.class, LABEL_KEY).e(Error.InactiveTemplateError.class, "inactive_template_error").e(Error.InvalidConfigError.class, "invalid_config").e(Error.UnauthenticatedError.class, "unauthenticated").e(Error.InconsistentTransitionError.class, "inconsistent_transition_error").e(Error.TransitionFromTerminalStateError.class, "transition_from_terminal_state_error").e(Error.FieldNotFoundError.class, "field_not_found_error").e(Error.RateLimitExceededError.class, "rate_limit_exceeded").e(Error.InvalidFieldValueError.class, "invalid_field_value_error").e(Error.UnknownError.class, "unknown_error").d(UnknownErrorAdapter.INSTANCE);

        private ErrorJsonAdapterFactory() {
        }

        @Override // com.squareup.moshi.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, u uVar) {
            final h<?> hVarCreate = adapterFactory.create(type, set, uVar);
            if (hVarCreate == null) {
                return null;
            }
            return new h<Error>(hVarCreate) { // from class: com.withpersona.sdk2.inquiry.network.core.ErrorResponse$ErrorJsonAdapterFactory$create$1
                private final h<ErrorResponse.Error> errorAdapter;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.errorAdapter = hVarCreate;
                }

                public static /* synthetic */ void getErrorAdapter$annotations() {
                }

                public final h<ErrorResponse.Error> getErrorAdapter() {
                    return this.errorAdapter;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.moshi.h
                public ErrorResponse.Error fromJson(k kVar) {
                    return ErrorResponse.ErrorJsonAdapterFactory.INSTANCE.hasLabel(kVar.C()) ? this.errorAdapter.fromJson(kVar) : ErrorResponse.UnknownErrorAdapter.INSTANCE.fromJson(kVar);
                }

                @Override // com.squareup.moshi.h
                public void toJson(r rVar, ErrorResponse.Error error) {
                    this.errorAdapter.toJson(rVar, error);
                }
            }.nullSafe();
        }

        public final boolean hasLabel(k kVar) {
            kVar.h();
            while (kVar.hasNext()) {
                if (s.f(kVar.L(), LABEL_KEY)) {
                    return true;
                }
                kVar.F();
            }
            return false;
        }
    }

    public static final class UnknownErrorAdapter extends h<Error.UnknownError> {
        public static final UnknownErrorAdapter INSTANCE = new UnknownErrorAdapter();

        private UnknownErrorAdapter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.h
        public Error.UnknownError fromJson(k kVar) {
            kVar.h();
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            while (kVar.hasNext()) {
                String strL = kVar.L();
                if (s.f(strL, "code")) {
                    strNextStringOrNull2 = JsonReaderUtilsKt.nextStringOrNull(kVar);
                } else if (s.f(strL, "title")) {
                    strNextStringOrNull = JsonReaderUtilsKt.nextStringOrNull(kVar);
                } else {
                    kVar.F();
                }
            }
            kVar.j();
            return new Error.UnknownError(strNextStringOrNull, strNextStringOrNull2);
        }

        @Override // com.squareup.moshi.h
        public void toJson(r rVar, Error.UnknownError unknownError) {
            rVar.o();
            rVar.b0("originalCode");
            rVar.G0(unknownError != null ? unknownError.getOriginalCode() : null);
            rVar.b0("title");
            rVar.G0(unknownError != null ? unknownError.getTitle() : null);
            rVar.C();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorResponse(List<? extends Error> list) {
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = errorResponse.errors;
        }
        return errorResponse.copy(list);
    }

    public final List<Error> component1() {
        return this.errors;
    }

    public final ErrorResponse copy(List<? extends Error> list) {
        return new ErrorResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ErrorResponse) && s.f(this.errors, ((ErrorResponse) obj).errors);
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        List<Error> list = this.errors;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final /* synthetic */ <T extends Error> boolean isAnyError() {
        List<Error> errors = getErrors();
        if (errors == null || errors.isEmpty()) {
            return false;
        }
        for (Error error : errors) {
            s.q(3, "T");
            if (error != null) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "ErrorResponse(errors=" + this.errors + ")";
    }
}
