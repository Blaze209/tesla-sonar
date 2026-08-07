package atd.aj;

import atd.ak.getSDKTransactionID;
import atd.am.ChallengeResultCancelled;
import atd.am.getSDKAppID;
import atd.an.getMessageVersion;
import com.adyen.threeds2.exception.InvalidInputException;
import com.adyen.threeds2.exception.SDKRuntimeException;
import com.adyen.threeds2.parameters.ConfigParameters;
import com.adyen.threeds2.util.AdyenConfigParameters;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000\u001a\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0003H\u0002\u001a\u0018\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001*\u00020\u0003H\u0002\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"retrieveDirectoryServerKeys", "Lcom/adyen/threeds2/internal/result/Result;", "Lcom/adyen/threeds2/internal/result/DirectoryServerKeysResult;", "Lcom/adyen/threeds2/parameters/ConfigParameters;", "retrievePublicKey", "Lcom/adyen/threeds2/internal/jose/jwk/JsonWebKey;", "retrieveRootCertificates", "", "Ljava/security/cert/X509Certificate;", "KEY_KID", "", "KEY_CERTIFICATES", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData {
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKTransactionID = 1;

    public static final getSDKAppID<atd.am.AuthenticationRequestParameters> AuthenticationRequestParameters(ConfigParameters configParameters) {
        return (getSDKAppID) getSDKReferenceNumber(new Object[]{configParameters}, 288861908, -288861908, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) throws Throwable {
        ChallengeResultCancelled challengeResultCancelled;
        int i11 = 0;
        ConfigParameters configParameters = (ConfigParameters) objArr[0];
        int i12 = getSDKTransactionID;
        int i13 = i12 & 45;
        int i14 = ((i12 ^ 45) | i13) << 1;
        int i15 = -((i12 | 45) & (~i13));
        AuthenticationRequestParameters = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
        try {
            atd.ak.AuthenticationRequestParameters deviceData = atd.ak.AuthenticationRequestParameters.getDeviceData(AdyenConfigParameters.getParamValue(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_ROOT_CERTIFICATES), atd.ae.getDeviceData.AuthenticationRequestParameters);
            int i16 = getSDKTransactionID + 61;
            AuthenticationRequestParameters = i16 % 128;
            try {
                if (i16 % 2 != 0) {
                    deviceData.getSDKTransactionID(getMessageVersion.AuthenticationRequestParameters(atd.json.ChallengeResultCancelled.getSDKReferenceNumber("VnlkU0FYQW9JUTFTQUNRYmJuRVlZVzBjWjM1NlF3d3BIM01GSW10S1JVNTBlRjhfWlhSUmZnd3hXaW9NY1I4bGNpOHJOVTFqYjBwa0ZoTjVMSGtwYmxZQUFVRTdSQU5TSUFZZFB4UXFBMEpxT2pjLUNCSmlMVDhCUERWOWZDRkdQdzlmWXdCbGVBNFViUlIzV21aUU55UVJIaEkzTWlkOEx4SWtGWDR3YTBZa1BpRTZhQVV5SUVKNFkxeHNheEJtVkVZdWFTcEFLWElwQ0JNQmZEWTRkd0ZrY21sSEZXTWhTMUlOSlZaUlJHdG5YeUZ0UEFGeERqNFJEU29xV0hZQ1B6Y1RlaGh2Q3pjSEYyb0tkeElNWlZJTEkxc1JLaXN3QWtFcWFXVkNabElvSVFNaUNDOHFVbHhVWEdSdWNSRkhUakk5TUEwb0VEUkZFMFpLQlYwZE1UeGVBaUJXYmhwR0l3UmVHM2tqVEFFSE5XWTFMV1prZVZRTlhVd2FYd1Y2TFFCSUd4Vk1Pd2cyWkNzWkNRQjhlUTEzSVRNWGZuQThBVDFrWkhKTFRVb1BhRkIwUG0wZkxna01DMHcxWjNFNGRsVVVEakFuYnlRMUpnZ2taaVo2RGlScFV4aGZGSGhDQlJnUWUxTUZCVnNhWmlRTGRUUlFVVzlVVVNOOFhGSWRkU1FlYkQ1b2NtRVZlMTFNY3o1LVZFMWJWRElMUWtaRVFERVRGd3RIVXhzaEZGQXlLanR4YWpVdkwza2RTbWR1S0NNVFVGWVphMEl6T2tKSk55UUJQbXBuTEJKQmNIa2NSQmtqRkZaaEdoOWNSVlZnRWtNU0xGQUNLQnRDWG5GQk5SOUxhRU14ZFhGMUdsaGtEMEJzTHk1SEVpd29EQlUzYVdabUExSWJOVDVYYVYwTkxGb2hHekFHQ3hRUlhXZFVKaXNER0VzRUVINThJaWNaSXlRUGFBVmxRUzl0VXljRVR6OWhkQklhTlR0Z0dFUmhjQjUzQUhWSlQwQmRMam8xVkVobkoySVNSUVpIZkY5TVlSNHNFRnNyS2d3dVdnaDVOeEEtVEZ4ekd3SUxUVEU3R3dNREFCWS1KeFpZTHpKME0zUmxPbDFqQUFaYlBnTU9ZMU1JWTFGLUN5SjZNQlktZGxrblBBc2tMRG81Q2pKN2RuZGZRZ2RkS3lSbkIxOWZBVWdoTVZRV1MxWVJHaFFMSFVCQkRGdzVUQlFpTVFFYUloWllGQnRmWm0xVUZoMGpIMlJ4S1dsMWF3STFQZ3hoTlM5S0ttVVdQeDh3ZVJvWFVsVVJjVFI5S1E4QlJYUkNVQmNOTEJrcWNRZ3ZJd1FKWDNaSlZ3QXRhVnhqWm1vOVh5QlJNek03SjNkdE1CUTNHSFk0WUM5QVV4NFRmbFUxVHlBMlVRMERJMHM4ZTNrWklGMUtMa0pxUWlKN01FSmtPZ0pPV2hjMFZSWjZUUVplVlVsdlZrTlliaWtSVXlRQkVWQTJiUmdVSzBvRVJ5RVlMenQ1TndWUEZRQUNMUXhkZGhFLWR3dDFMVVIzSGtWeWRRRlNQMUJzQlcxdGJtZGlEeGd1TDNaRE4yeHVZV1I5WFQ0akVSOUpPV29PUnlOSlQxQjNhVlVxVENCcURWNFVUak1BWHlCNE5Fa0FSVnN5SHg1YlhHeGRHenBFRVRGRmJSMXJBWHdZUWdGREFEaE5SeGgxY2pjTFJsRlpYVWNJVkE4WUgxNXRYaTVKQ1RBRVEyczZQaDVkQUR3ZGRWSnFBRVVoSlN0NE9FUklNVFpqZHdjY056aHBGa0k5ZlFCWlpGdEVCUjRaQ1hjQVhuc09ER3dwSFU5VVdnVmxkMHhYTzNOY2V4c3pOVmRoTUQ1akUzTkxmZ1Z1SUJGa2ZGOTZiMVVwSndCVEtYQTFLbTFsRHdaVUJ4eGxJVXh1RXlNQ1doRWxQZ0BHbTRiUlQxQ1lrNFRjR3Q4THdaUkl5eDdMaXM0QlZaRmZFdHdaaTBvYWkwN0xoTU5IeU0zTzNsNGJteGJGSHhTTVVoeWZBWU1OUU1lZkNNOGJRNWdHVEZaVkRsNFBrSVlZbUZUYVZacldoWXJVUUp6UlVNUldueFFaWEVyTFhBUGUwNFZMRk1oUFYxWkwxVXdHMWNGY21abWFWaG1aUllHUzFWeWJDUjNMVEpwYkd4TkxWUnJaQlFwTWhjb0ttQWtEZzVDQlVncGF6MWxaRXAwTVdSTEFFWTFLeTBSUkRKdER4Qkhad3daS0FjRk5tTThYa1kzUG1SOE5GTklDelJUYkFkNEFsRVZTbDlGY0NSY05WTkJLQlZnWlRCMGZYMUZTd2RvR2p3YU5EOUtFa2xXUVdwOEZnMHRIamNNUXloM0IzZHpja0JyVVd3QlJ3OHpTQmxNUm5JMFF4UWJPa014YlRVeFFqMVpCWFpKWVM5Q1lCd3RUQmxKT2pSVU5VUkplbW9MV1gwWWZrUjdKVUJlU0RFcFBFOGZiSEJERlFkRVFrY2xMakFzQXh4TktUYzVmd1lxWjBSZVFqdHdKaWg4SUFSRlJuUm1BMlpYZmtZVVBINHdaWDAtWTJBYWJqa1FSMzllTFJGRWFoWlpEV0pnRUdNR0pDWVJaVllxTldabE1sNWZObndQUERkWE9pNEJObFU0UHlnTUFrZENCQVEzR1dsQmVtbDBHVzlvVWhKLWVXODBBSGhzYWo1Y2V6SXJhVlJrTVFkT09YZHBiWFl1WW1ONVZnNGdkbVFpSFVsN0ZreHRVQjhuVUdrLWRnUUhRM05YV3pkWVcyd0hIeWdKZm5BUklUbGJSVEkwU3dFaVJIUXBhbThFWDJoUFZVeDJLeWNqUUJ3cEFWSXhNUlJsVGdOTVlsaC1hbHRtR3dGbVhud3hRQnBSYWhZdWNoVjZaM001V1RVZ2Jrd25PMTFlSzBVd0VIZFhCbUVoWEJBYkUxVWtjRDFtTEE4TWRBbHdiUWxTZmdwMU5VRXhMRGNyT1hWSVVtMTZiMWthRW0wUlVHSnFkVGtqYnpWb2ZsNW9iMmhpYUVKRWZTOFBZVkVsQWt3M2NUVlJhSFpwZVhKZVZTVk9DamhIYUV3T1lWNUdBQ3gyVG1COVhWRkJPRjVMT2pFdUpIQTRBSEltY1JvVWJDdE1DQVpWQUdaUWUxdEpjQlFDVGpCVERYQmdWazlNYWtkc1VWMDROemdZUlV4UGFGSVFSUUVYUG5oU2IyY29CMGtwVHlweFNFdFpDRTlnR2lKSU5XSXZHV1ZEQnhNMUZuaE1lVlY1SUdSWUZXVmxOeFFjTFdkOEFoVlJBQWxZRUVjbVoxcEtjZ0FwUjAxelRpUUlORzRSR3pGUlB3QkNEbGR6RXlKNVlnUi1IRGRQYUF4eWJBTU1lbWM1Y1E4bmUxc1hMVnBEREZJc0h6WTRGd29ZSVFneUwwWi1FRVZtV3hsdkJIbGNlWHBuRDJ3dVkwSkFYMThIZVd4Z1JEazNGQ01PQVZKR1p6YzdMUThFRnpJRFNnbGZUeDRoQUNVT2JVeHZaRFFrVUIwR0NnNHlEVzl5VlY0dWRpaGtCbUktS0FrUUtnUk5DVUpCT1IxdUtIWkRHMGs5QWlaR0NXTjFTMXBwRWowMVRYVVVZUU1jSFNvaWVEUk1jMjRnWkFFbUNGZE1RRjFjTUNrZUVqWnBCamRLZEc4b0hXWi1PWEV5SkNZVlVDNG5iSGN1TzJBdWVRNVJiMkVYV1hNSFZud2dOazR6Y0dBdmNoZE9PVU55RDJrQk1YMXdSejl0YXlsX09RUjdjd2NTRjJ3SlRoZ1JWMFU1UTM4RVpnMG9XMHM1YVFZRlJtTUNTVDR3S3dnd0RneFBFVThyV2dwZmZ3OG9lVGNYZlZkU1FBNGpkbUpuS0V0MlJB")));
                    int i17 = 29 / 0;
                } else {
                    deviceData.getSDKTransactionID(getMessageVersion.AuthenticationRequestParameters(atd.json.ChallengeResultCancelled.getSDKReferenceNumber("VnlkU0FYQW9JUTFTQUNRYmJuRVlZVzBjWjM1NlF3d3BIM01GSW10S1JVNTBlRjhfWlhSUmZnd3hXaW9NY1I4bGNpOHJOVTFqYjBwa0ZoTjVMSGtwYmxZQUFVRTdSQU5TSUFZZFB4UXFBMEpxT2pjLUNCSmlMVDhCUERWOWZDRkdQdzlmWXdCbGVBNFViUlIzV21aUU55UVJIaEkzTWlkOEx4SWtGWDR3YTBZa1BpRTZhQVV5SUVKNFkxeHNheEJtVkVZdWFTcEFLWElwQ0JNQmZEWTRkd0ZrY21sSEZXTWhTMUlOSlZaUlJHdG5YeUZ0UEFGeERqNFJEU29xV0hZQ1B6Y1RlaGh2Q3pjSEYyb0tkeElNWlZJTEkxc1JLaXN3QWtFcWFXVkNabElvSVFNaUNDOHFVbHhVWEdSdWNSRkhUakk5TUEwb0VEUkZFMFpLQlYwZE1UeGVBaUJXYmhwR0l3UmVHM2tqVEFFSE5XWTFMV1prZVZRTlhVd2FYd1Y2TFFCSUd4Vk1Pd2cyWkNzWkNRQjhlUTEzSVRNWGZuQThBVDFrWkhKTFRVb1BhRkIwUG0wZkxna01DMHcxWjNFNGRsVVVEakFuYnlRMUpnZ2taaVo2RGlScFV4aGZGSGhDQlJnUWUxTUZCVnNhWmlRTGRUUlFVVzlVVVNOOFhGSWRkU1FlYkQ1b2NtRVZlMTFNY3o1LVZFMWJWRElMUWtaRVFERVRGd3RIVXhzaEZGQXlLanR4YWpVdkwza2RTbWR1S0NNVFVGWVphMEl6T2tKSk55UUJQbXBuTEJKQmNIa2NSQmtqRkZaaEdoOWNSVlZnRWtNU0xGQUNLQnRDWG5GQk5SOUxhRU14ZFhGMUdsaGtEMEJzTHk1SEVpd29EQlUzYVdabUExSWJOVDVYYVYwTkxGb2hHekFHQ3hRUlhXZFVKaXNER0VzRUVINThJaWNaSXlRUGFBVmxRUzl0VXljRVR6OWhkQklhTlR0Z0dFUmhjQjUzQUhWSlQwQmRMam8xVkVobkoySVNSUVpIZkY5TVlSNHNFRnNyS2d3dVdnaDVOeEEtVEZ4ekd3SUxUVEU3R3dNREFCWS1KeFpZTHpKME0zUmxPbDFqQUFaYlBnTU9ZMU1JWTFGLUN5SjZNQlktZGxrblBBc2tMRG81Q2pKN2RuZGZRZ2RkS3lSbkIxOWZBVWdoTVZRV1MxWVJHaFFMSFVCQkRGdzVUQlFpTVFFYUloWllGQnRmWm0xVUZoMGpIMlJ4S1dsMWF3STFQZ3hoTlM5S0ttVVdQeDh3ZVJvWFVsVVJjVFI5S1E4QlJYUkNVQmNOTEJrcWNRZ3ZJd1FKWDNaSlZ3QXRhVnhqWm1vOVh5QlJNek03SjNkdE1CUTNHSFk0WUM5QVV4NFRmbFUxVHlBMlVRMERJMHM4ZTNrWklGMUtMa0pxUWlKN01FSmtPZ0pPV2hjMFZSWjZUUVplVlVsdlZrTlliaWtSVXlRQkVWQTJiUmdVSzBvRVJ5RVlMenQ1TndWUEZRQUNMUXhkZGhFLWR3dDFMVVIzSGtWeWRRRlNQMUJzQlcxdGJtZGlEeGd1TDNaRE4yeHVZV1I5WFQ0akVSOUpPV29PUnlOSlQxQjNhVlVxVENCcURWNFVUak1BWHlCNE5Fa0FSVnN5SHg1YlhHeGRHenBFRVRGRmJSMXJBWHdZUWdGREFEaE5SeGgxY2pjTFJsRlpYVWNJVkE4WUgxNXRYaTVKQ1RBRVEyczZQaDVkQUR3ZGRWSnFBRVVoSlN0NE9FUklNVFpqZHdjY056aHBGa0k5ZlFCWlpGdEVCUjRaQ1hjQVhuc09ER3dwSFU5VVdnVmxkMHhYTzNOY2V4c3pOVmRoTUQ1akUzTkxmZ1Z1SUJGa2ZGOTZiMVVwSndCVEtYQTFLbTFsRHdaVUJ4eGxJVXh1RXlNQ1doRWxQZ0BHbTRiUlQxQ1lrNFRjR3Q4THdaUkl5eDdMaXM0QlZaRmZFdHdaaTBvYWkwN0xoTU5IeU0zTzNsNGJteGJGSHhTTVVoeWZBWU1OUU1lZkNNOGJRNWdHVEZaVkRsNFBrSVlZbUZUYVZacldoWXJVUUp6UlVNUldueFFaWEVyTFhBUGUwNFZMRk1oUFYxWkwxVXdHMWNGY21abWFWaG1aUllHUzFWeWJDUjNMVEpwYkd4TkxWUnJaQlFwTWhjb0ttQWtEZzVDQlVncGF6MWxaRXAwTVdSTEFFWTFLeTBSUkRKdER4Qkhad3daS0FjRk5tTThYa1kzUG1SOE5GTklDelJUYkFkNEFsRVZTbDlGY0NSY05WTkJLQlZnWlRCMGZYMUZTd2RvR2p3YU5EOUtFa2xXUVdwOEZnMHRIamNNUXloM0IzZHpja0JyVVd3QlJ3OHpTQmxNUm5JMFF4UWJPa014YlRVeFFqMVpCWFpKWVM5Q1lCd3RUQmxKT2pSVU5VUkplbW9MV1gwWWZrUjdKVUJlU0RFcFBFOGZiSEJERlFkRVFrY2xMakFzQXh4TktUYzVmd1lxWjBSZVFqdHdKaWg4SUFSRlJuUm1BMlpYZmtZVVBINHdaWDAtWTJBYWJqa1FSMzllTFJGRWFoWlpEV0pnRUdNR0pDWVJaVllxTldabE1sNWZObndQUERkWE9pNEJObFU0UHlnTUFrZENCQVEzR1dsQmVtbDBHVzlvVWhKLWVXODBBSGhzYWo1Y2V6SXJhVlJrTVFkT09YZHBiWFl1WW1ONVZnNGdkbVFpSFVsN0ZreHRVQjhuVUdrLWRnUUhRM05YV3pkWVcyd0hIeWdKZm5BUklUbGJSVEkwU3dFaVJIUXBhbThFWDJoUFZVeDJLeWNqUUJ3cEFWSXhNUlJsVGdOTVlsaC1hbHRtR3dGbVhud3hRQnBSYWhZdWNoVjZaM001V1RVZ2Jrd25PMTFlSzBVd0VIZFhCbUVoWEJBYkUxVWtjRDFtTEE4TWRBbHdiUWxTZmdwMU5VRXhMRGNyT1hWSVVtMTZiMWthRW0wUlVHSnFkVGtqYnpWb2ZsNW9iMmhpYUVKRWZTOFBZVkVsQWt3M2NUVlJhSFpwZVhKZVZTVk9DamhIYUV3T1lWNUdBQ3gyVG1COVhWRkJPRjVMT2pFdUpIQTRBSEltY1JvVWJDdE1DQVpWQUdaUWUxdEpjQlFDVGpCVERYQmdWazlNYWtkc1VWMDROemdZUlV4UGFGSVFSUUVYUG5oU2IyY29CMGtwVHlweFNFdFpDRTlnR2lKSU5XSXZHV1ZEQnhNMUZuaE1lVlY1SUdSWUZXVmxOeFFjTFdkOEFoVlJBQWxZRUVjbVoxcEtjZ0FwUjAxelRpUUlORzRSR3pGUlB3QkNEbGR6RXlKNVlnUi1IRGRQYUF4eWJBTU1lbWM1Y1E4bmUxc1hMVnBEREZJc0h6WTRGd29ZSVFneUwwWi1FRVZtV3hsdkJIbGNlWHBuRDJ3dVkwSkFYMThIZVd4Z1JEazNGQ01PQVZKR1p6YzdMUThFRnpJRFNnbGZUeDRoQUNVT2JVeHZaRFFrVUIwR0NnNHlEVzl5VlY0dWRpaGtCbUktS0FrUUtnUk5DVUpCT1IxdUtIWkRHMGs5QWlaR0NXTjFTMXBwRWowMVRYVVVZUU1jSFNvaWVEUk1jMjRnWkFFbUNGZE1RRjFjTUNrZUVqWnBCamRLZEc4b0hXWi1PWEV5SkNZVlVDNG5iSGN1TzJBdWVRNVJiMkVYV1hNSFZud2dOazR6Y0dBdmNoZE9PVU55RDJrQk1YMXdSejl0YXlsX09RUjdjd2NTRjJ3SlRoZ1JWMFU1UTM4RVpnMG9XMHM1YVFZRlJtTUNTVDR3S3dnd0RneFBFVThyV2dwZmZ3OG9lVGNYZlZkU1FBNGpkbUpuS0V0MlJB")));
                }
                int i18 = getSDKTransactionID + 16;
                int i19 = ((i18 ^ (-1)) + (i18 << 1)) % 128;
                AuthenticationRequestParameters = i19;
                getSDKTransactionID = (((i19 | 91) << 1) - (((~i19) & 91) | (i19 & (-92)))) % 128;
                try {
                    JSONArray jSONArray = ((getSDKTransactionID) atd.ak.AuthenticationRequestParameters.getSDKTransactionID(new Object[]{deviceData}, -465202534, 465202534, System.identityHashCode(deviceData))).getMessageVersion().getJSONArray("certificates");
                    int i21 = getSDKTransactionID;
                    int i22 = (i21 & (-126)) | ((~i21) & 125);
                    int i23 = -(-((i21 & 125) << 1));
                    AuthenticationRequestParameters = (((i22 | i23) << 1) - (i23 ^ i22)) % 128;
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    int i24 = getSDKTransactionID;
                    AuthenticationRequestParameters = ((((i24 & (-14)) | ((~i24) & 13)) - (~((i24 & 13) << 1))) - 1) % 128;
                    while (i11 < length) {
                        int i25 = getSDKTransactionID;
                        int i26 = i25 & 21;
                        int i27 = ((i25 ^ 21) | i26) << 1;
                        int i28 = -((i25 | 21) & (~i26));
                        int i29 = (i27 & i28) + (i28 | i27);
                        AuthenticationRequestParameters = i29 % 128;
                        if (i29 % 2 != 0) {
                            getMessageVersion.AuthenticationRequestParameters(jSONArray.getString(i11));
                            throw null;
                        }
                        try {
                            X509Certificate x509CertificateAuthenticationRequestParameters = getMessageVersion.AuthenticationRequestParameters(jSONArray.getString(i11));
                            int i31 = getSDKTransactionID;
                            int i32 = i31 & 51;
                            int i33 = (i31 ^ 51) | i32;
                            AuthenticationRequestParameters = ((i32 & i33) + (i33 | i32)) % 128;
                            arrayList.add(x509CertificateAuthenticationRequestParameters);
                            i11 = ((i11 & 99) + (i11 | 99)) - 98;
                            int i34 = AuthenticationRequestParameters;
                            getSDKTransactionID = ((i34 & 53) + (i34 | 53)) % 128;
                        } catch (CertificateException unused) {
                            ChallengeResultCancelled challengeResultCancelled2 = ChallengeResultCancelled.ROOT_CERTIFICATES_GENERATION_FAILURE;
                            InvalidInputException sDKTransactionID = atd.ad.getDeviceData.CONFIG_PARAMETERS.getSDKTransactionID();
                            s.j(sDKTransactionID, "");
                            return new getSDKAppID.getSDKTransactionID(challengeResultCancelled2, sDKTransactionID, null, null, 12);
                        }
                        ChallengeResultCancelled challengeResultCancelled3 = ChallengeResultCancelled.ROOT_CERTIFICATES_GENERATION_FAILURE;
                        InvalidInputException sDKTransactionID2 = atd.ad.getDeviceData.CONFIG_PARAMETERS.getSDKTransactionID();
                        s.j(sDKTransactionID2, "");
                        return new getSDKAppID.getSDKTransactionID(challengeResultCancelled3, sDKTransactionID2, null, null, 12);
                    }
                    getSDKAppID.getDeviceData getdevicedata = new getSDKAppID.getDeviceData(arrayList);
                    int i35 = getSDKTransactionID;
                    int i36 = i35 & 111;
                    int i37 = (i35 ^ 111) | i36;
                    AuthenticationRequestParameters = ((i36 & i37) + (i37 | i36)) % 128;
                    return getdevicedata;
                } catch (JSONException unused2) {
                    ChallengeResultCancelled challengeResultCancelled4 = ChallengeResultCancelled.ROOT_CERTIFICATES_JWS_PAYLOAD_DESERIALIZATION_FAILURE;
                    InvalidInputException sDKTransactionID3 = atd.ad.getDeviceData.CONFIG_PARAMETERS.getSDKTransactionID();
                    s.j(sDKTransactionID3, "");
                    return new getSDKAppID.getSDKTransactionID(challengeResultCancelled4, sDKTransactionID3, null, null, 12);
                }
            } catch (SDKRuntimeException unused3) {
                ChallengeResultCancelled challengeResultCancelled5 = ChallengeResultCancelled.ROOT_CERTIFICATES_JWS_VERIFICATION_FAILURE;
                InvalidInputException sDKTransactionID4 = atd.ad.getDeviceData.CONFIG_PARAMETERS.getSDKTransactionID();
                s.j(sDKTransactionID4, "");
                return new getSDKAppID.getSDKTransactionID(challengeResultCancelled5, sDKTransactionID4, null, null, 12);
            }
        } catch (Throwable th2) {
            if (th2 instanceof atd.z.AuthenticationRequestParameters) {
                atd.z.AuthenticationRequestParameters authenticationRequestParameters = th2;
                challengeResultCancelled = (ChallengeResultCancelled) atd.z.AuthenticationRequestParameters.getSDKTransactionID(new Object[]{authenticationRequestParameters}, -861264258, 861264258, System.identityHashCode(authenticationRequestParameters));
                int i38 = AuthenticationRequestParameters;
                getSDKTransactionID = ((i38 & 85) + (i38 | 85)) % 128;
            } else {
                challengeResultCancelled = ChallengeResultCancelled.ROOT_CERTIFICATES_HANDLING_GENERAL_FAILURE;
                int i39 = AuthenticationRequestParameters;
                int i41 = i39 & 27;
                int i42 = (i39 ^ 27) | i41;
                getSDKTransactionID = ((i41 ^ i42) + ((i42 & i41) << 1)) % 128;
            }
            ChallengeResultCancelled challengeResultCancelled6 = challengeResultCancelled;
            InvalidInputException sDKTransactionID5 = atd.ad.getDeviceData.CONFIG_PARAMETERS.getSDKTransactionID();
            s.j(sDKTransactionID5, "");
            getSDKAppID.getSDKTransactionID getsdktransactionid = new getSDKAppID.getSDKTransactionID(challengeResultCancelled6, sDKTransactionID5, null, null, 12);
            int i43 = getSDKTransactionID;
            int i44 = (i43 & 33) + (i43 | 33);
            AuthenticationRequestParameters = i44 % 128;
            if (i44 % 2 == 0) {
                return getsdktransactionid;
            }
            throw null;
        }
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        ConfigParameters configParameters = (ConfigParameters) objArr[0];
        int i11 = getSDKTransactionID;
        int i12 = i11 & 49;
        int i13 = ((i11 ^ 49) | i12) << 1;
        int i14 = -((i11 | 49) & (~i12));
        AuthenticationRequestParameters = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
        s.k(configParameters, "");
        getSDKAppID getsdkappid = (getSDKAppID) getSDKReferenceNumber(new Object[]{configParameters}, 548024225, -548024224, (int) System.currentTimeMillis());
        if (!(getsdkappid instanceof getSDKAppID.getDeviceData)) {
            if (!(getsdkappid instanceof getSDKAppID.getSDKTransactionID)) {
                throw new NoWhenBranchMatchedException();
            }
            int i15 = getSDKTransactionID;
            int i16 = (i15 & (-94)) | ((~i15) & 93);
            int i17 = -(-((i15 & 93) << 1));
            int i18 = (i16 & i17) + (i16 | i17);
            AuthenticationRequestParameters = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            AuthenticationRequestParameters = (((i15 | 73) << 1) - (i15 ^ 73)) % 128;
            return getsdkappid;
        }
        int i19 = AuthenticationRequestParameters;
        int i21 = (i19 & 89) + (i19 | 89);
        getSDKTransactionID = i21 % 128;
        if (i21 % 2 == 0) {
            getSDKAppID.getDeviceData getdevicedata = (getSDKAppID.getDeviceData) getsdkappid;
            throw null;
        }
        getSDKAppID.getDeviceData getdevicedata2 = (getSDKAppID.getDeviceData) getsdkappid;
        atd.af.AuthenticationRequestParameters authenticationRequestParameters = (atd.af.AuthenticationRequestParameters) getSDKAppID.getDeviceData.AuthenticationRequestParameters(new Object[]{getdevicedata2}, -389237788, 389237789, System.identityHashCode(getdevicedata2));
        int i22 = AuthenticationRequestParameters;
        int i23 = i22 & 19;
        getSDKTransactionID = (i23 + ((i22 ^ 19) | i23)) % 128;
        getSDKAppID getsdkappid2 = (getSDKAppID) getSDKReferenceNumber(new Object[]{configParameters}, -1251416701, 1251416703, (int) System.currentTimeMillis());
        if (!(getsdkappid2 instanceof getSDKAppID.getDeviceData)) {
            if (!(getsdkappid2 instanceof getSDKAppID.getSDKTransactionID)) {
                throw new NoWhenBranchMatchedException();
            }
            int i24 = AuthenticationRequestParameters;
            int i25 = ((((i24 ^ 65) | (i24 & 65)) << 1) - (~(-((i24 & (-66)) | ((~i24) & 65))))) - 1;
            getSDKTransactionID = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 25 / 0;
            }
            int i27 = i24 & 123;
            getSDKTransactionID = ((i27 - (~((i24 ^ 123) | i27))) - 1) % 128;
            return getsdkappid2;
        }
        int i28 = AuthenticationRequestParameters;
        int i29 = i28 & 37;
        getSDKTransactionID = (i29 + ((i28 ^ 37) | i29)) % 128;
        getSDKAppID.getDeviceData getdevicedata3 = (getSDKAppID.getDeviceData) getsdkappid2;
        List list = (List) getSDKAppID.getDeviceData.AuthenticationRequestParameters(new Object[]{getdevicedata3}, -389237788, 389237789, System.identityHashCode(getdevicedata3));
        int i31 = AuthenticationRequestParameters;
        getSDKTransactionID = (((i31 & 122) + (i31 | 122)) - 1) % 128;
        getSDKAppID.getDeviceData getdevicedata4 = new getSDKAppID.getDeviceData(new atd.am.AuthenticationRequestParameters(authenticationRequestParameters, list));
        int i32 = getSDKTransactionID;
        int i33 = ((i32 | 44) << 1) - (i32 ^ 44);
        AuthenticationRequestParameters = ((i33 ^ (-1)) + (i33 << 1)) % 128;
        return getdevicedata4;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * 628) + (i12 * 628) + ((i12 | i13 | (~i11)) * (-627)) + (((~((~i12) | i13)) | i11) * (-627)) + (((~(i11 | i13)) | (~(i12 | (~i13)))) * 627);
        if (i14 != 1) {
            return i14 != 2 ? getSDKAppID(objArr) : getDeviceData(objArr);
        }
        return getSDKReferenceNumber(objArr);
    }

    private static final getSDKAppID<atd.af.AuthenticationRequestParameters> getSDKTransactionID(ConfigParameters configParameters) {
        return (getSDKAppID) getSDKReferenceNumber(new Object[]{configParameters}, 548024225, -548024224, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        ChallengeResultCancelled challengeResultCancelled;
        int i11;
        int i12;
        Object getdevicedata;
        ConfigParameters configParameters = (ConfigParameters) objArr[0];
        int i13 = AuthenticationRequestParameters;
        int i14 = i13 & 29;
        getSDKTransactionID = ((((i13 | 29) & (~i14)) - (~(-(-(i14 << 1))))) - 1) % 128;
        String paramValue = AdyenConfigParameters.getParamValue(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_ID);
        try {
            JSONObject jSONObjectAuthenticationRequestParameters = ((atd.json.getDeviceData) atd.json.getDeviceData.getSDKTransactionID(new Object[0], 76032564, -76032563, (int) System.currentTimeMillis())).AuthenticationRequestParameters(AdyenConfigParameters.getParamValue(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_PUBLIC_KEY));
            if (!jSONObjectAuthenticationRequestParameters.has("kid")) {
                int i15 = getSDKTransactionID;
                int i16 = (i15 & (-122)) | ((~i15) & 121);
                int i17 = (i15 & 121) << 1;
                AuthenticationRequestParameters = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
                jSONObjectAuthenticationRequestParameters.put("kid", paramValue);
                int i18 = AuthenticationRequestParameters;
                int i19 = i18 & 69;
                getSDKTransactionID = (((i18 | 69) & (~i19)) + (i19 << 1)) % 128;
            }
            getdevicedata = new getSDKAppID.getDeviceData(atd.af.AuthenticationRequestParameters.AuthenticationRequestParameters(jSONObjectAuthenticationRequestParameters));
            atd.json.JSONObject.getSDKAppID(new Object[]{jSONObjectAuthenticationRequestParameters}, -1150790233, 1150790235, (int) System.currentTimeMillis());
            int i21 = getSDKTransactionID;
            int i22 = i21 ^ 79;
            AuthenticationRequestParameters = (((((i21 & 79) | i22) << 1) - (~(-i22))) - 1) % 128;
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                challengeResultCancelled = ChallengeResultCancelled.PUBLIC_KEY_BASE64_DECODING_FAILURE;
                int i23 = getSDKTransactionID;
                i11 = i23 & 101;
                i12 = i23 | 101;
            } else if (th2 instanceof JSONException) {
                int i24 = AuthenticationRequestParameters;
                int i25 = i24 & 47;
                int i26 = (i24 | 47) & (~i25);
                int i27 = -(-(i25 << 1));
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                getSDKTransactionID = i28 % 128;
                if (i28 % 2 == 0) {
                    challengeResultCancelled = ChallengeResultCancelled.PUBLIC_KEY_JSON_DESERIALIZATION_FAILURE;
                    int i29 = 39 / 0;
                } else {
                    challengeResultCancelled = ChallengeResultCancelled.PUBLIC_KEY_JSON_DESERIALIZATION_FAILURE;
                }
                int i31 = getSDKTransactionID;
                int i32 = i31 | 91;
                int i33 = i32 << 1;
                int i34 = -((~(i31 & 91)) & i32);
                i11 = i33 & i34;
                i12 = i34 | i33;
            } else {
                challengeResultCancelled = ChallengeResultCancelled.PUBLIC_KEY_HANDLING_GENERAL_FAILURE;
                int i35 = getSDKTransactionID;
                i11 = i35 & 71;
                i12 = (i35 ^ 71) | i11;
            }
            AuthenticationRequestParameters = (i11 + i12) % 128;
            ChallengeResultCancelled challengeResultCancelled2 = challengeResultCancelled;
            InvalidInputException sDKTransactionID = atd.ad.getDeviceData.CONFIG_PARAMETERS.getSDKTransactionID();
            s.j(sDKTransactionID, "");
            getSDKAppID.getSDKTransactionID getsdktransactionid = new getSDKAppID.getSDKTransactionID(challengeResultCancelled2, sDKTransactionID, null, null, 12);
            getSDKTransactionID = (AuthenticationRequestParameters + 49) % 128;
            getdevicedata = getsdktransactionid;
        }
        int i36 = AuthenticationRequestParameters;
        int i37 = (i36 ^ 59) + ((i36 & 59) << 1);
        getSDKTransactionID = i37 % 128;
        if (i37 % 2 != 0) {
            return getdevicedata;
        }
        throw null;
    }

    private static final getSDKAppID<List<X509Certificate>> getSDKAppID(ConfigParameters configParameters) {
        return (getSDKAppID) getSDKReferenceNumber(new Object[]{configParameters}, -1251416701, 1251416703, (int) System.currentTimeMillis());
    }
}
