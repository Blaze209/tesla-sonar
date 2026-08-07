package bh0;

import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "", "b", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Ljava/lang/String;", "Lzi0/d;", "a", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lzi0/d;", "inquiry-internal_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r {
    public static final zi0.d a(InternalErrorInfo internalErrorInfo) {
        p013kotlin.jvm.internal.s.k(internalErrorInfo, "<this>");
        if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
            return zi0.d.CameraCompatibilityError;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
            return zi0.d.IntegrationError;
        }
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
                return zi0.d.CameraPermissionError;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) {
                return zi0.d.SdkConfigurationError;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) {
                return zi0.d.NoDiskSpaceError;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
                return zi0.d.WebRtcIntegrationError;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode) {
                return zi0.d.InvalidOneTimeLinkCode;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) {
                return zi0.d.UnexpectedError;
            }
            throw new NoWhenBranchMatchedException();
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
        if (responseError instanceof ErrorResponse.Error.RateLimitExceededError) {
            return zi0.d.RateLimitExceeded;
        }
        if (responseError instanceof ErrorResponse.Error.UnauthenticatedError) {
            return zi0.d.SessionTokenError;
        }
        if ((responseError instanceof ErrorResponse.Error.FieldNotFoundError) || (responseError instanceof ErrorResponse.Error.InactiveTemplateError) || (responseError instanceof ErrorResponse.Error.InconsistentTransitionError) || (responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError) || (responseError instanceof ErrorResponse.Error.InvalidConfigError) || (responseError instanceof ErrorResponse.Error.UnknownError) || (responseError instanceof ErrorResponse.Error.InvalidFieldValueError) || responseError == null) {
            return networkErrorInfo.getCode() == 401 ? zi0.d.SessionTokenError : zi0.d.NetworkError;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(InternalErrorInfo internalErrorInfo) {
        p013kotlin.jvm.internal.s.k(internalErrorInfo, "<this>");
        if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
            return "Unable to find a suitable camera.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
            return "The SDK is misconfigured.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
            return "There was a problem reaching the server.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
            return "There was an issue with camera permissions.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) {
            return "The SDK needs a template ID that starts with `itmpl_`. If your template ID starts with `tmpl_`, you should use version v1.x of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v1";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) {
            return "The device has no available disk space.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
            return "WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode) {
            return "Invalid one time link code.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) {
            return "An otherwise unexpected error occurred.";
        }
        throw new NoWhenBranchMatchedException();
    }
}
