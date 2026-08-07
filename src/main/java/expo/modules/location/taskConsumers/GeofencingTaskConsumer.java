package expo.modules.location.taskConsumers;

import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;
import expo.modules.interfaces.taskManager.TaskConsumer;
import expo.modules.interfaces.taskManager.TaskConsumerInterface;
import expo.modules.interfaces.taskManager.TaskExecutionCallback;
import expo.modules.interfaces.taskManager.TaskInterface;
import expo.modules.interfaces.taskManager.TaskManagerUtilsInterface;
import expo.modules.location.GeofencingException;
import expo.modules.location.LocationHelpers;
import expo.modules.location.records.GeofencingRegionState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00182\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0018H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\tH\u0016¢\u0006\u0004\b2\u0010\u000bJ#\u00104\u001a\u00020\t2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\u001dH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010?\u001a\u00020>2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000e0J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\"0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lexpo/modules/location/taskConsumers/GeofencingTaskConsumer;", "Lexpo/modules/interfaces/taskManager/TaskConsumer;", "Lexpo/modules/interfaces/taskManager/TaskConsumerInterface;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;", "taskManagerUtils", "<init>", "(Landroid/content/Context;Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;)V", "Ljn0/h0;", "startGeofencing", "()V", "stopGeofencing", "", "Lcom/google/android/gms/location/Geofence;", "geofences", "Lcom/google/android/gms/location/GeofencingRequest;", "prepareGeofencingRequest", "(Ljava/util/List;)Lcom/google/android/gms/location/GeofencingRequest;", "Landroid/app/PendingIntent;", "preparePendingIntent", "()Landroid/app/PendingIntent;", "", "param", "", "errorMessage", "", "getParamAsDouble", "(Ljava/lang/Object;Ljava/lang/String;)D", "", "region", "geofenceFromRegion", "(Ljava/util/Map;)Lcom/google/android/gms/location/Geofence;", "identifier", "Landroid/os/PersistableBundle;", "bundleFromRegion", "(Ljava/lang/String;Ljava/util/Map;)Landroid/os/PersistableBundle;", "", "transitionType", "Lexpo/modules/location/records/GeofencingRegionState;", "regionStateForTransitionType", "(I)Lexpo/modules/location/records/GeofencingRegionState;", "eventTypeFromTransitionType", "(I)I", "taskType", "()Ljava/lang/String;", "Lexpo/modules/interfaces/taskManager/TaskInterface;", "task", "didRegister", "(Lexpo/modules/interfaces/taskManager/TaskInterface;)V", "didUnregister", "options", "setOptions", "(Ljava/util/Map;)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "didReceiveBroadcast", "(Landroid/content/Intent;)V", "Landroid/app/job/JobService;", "jobService", "Landroid/app/job/JobParameters;", "params", "", "didExecuteJob", "(Landroid/app/job/JobService;Landroid/app/job/JobParameters;)Z", "mTask", "Lexpo/modules/interfaces/taskManager/TaskInterface;", "mPendingIntent", "Landroid/app/PendingIntent;", "Lcom/google/android/gms/location/GeofencingClient;", "mGeofencingClient", "Lcom/google/android/gms/location/GeofencingClient;", "mGeofencingRequest", "Lcom/google/android/gms/location/GeofencingRequest;", "", "mGeofencingList", "Ljava/util/List;", "", "mRegions", "Ljava/util/Map;", "Companion", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeofencingTaskConsumer extends TaskConsumer implements TaskConsumerInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "GeofencingTaskConsumer";
    private GeofencingClient mGeofencingClient;
    private List<Geofence> mGeofencingList;
    private GeofencingRequest mGeofencingRequest;
    private PendingIntent mPendingIntent;
    private Map<String, PersistableBundle> mRegions;
    private TaskInterface mTask;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lexpo/modules/location/taskConsumers/GeofencingTaskConsumer$Companion;", "", "<init>", "()V", "TAG", "", "getErrorString", "errorCode", "", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getErrorString(int errorCode) {
            switch (errorCode) {
                case 1000:
                    return "Geofencing not available.";
                case 1001:
                    return "Too many geofences.";
                case 1002:
                    return "Too many pending intents.";
                default:
                    return "Unknown geofencing error.";
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeofencingTaskConsumer(Context context, TaskManagerUtilsInterface taskManagerUtilsInterface) {
        super(context, taskManagerUtilsInterface);
        s.k(context, "context");
        this.mGeofencingList = new ArrayList();
        this.mRegions = new HashMap();
    }

    private final PersistableBundle bundleFromRegion(String identifier, Map<String, ? extends Object> region) throws GeofencingException {
        PersistableBundle persistableBundle = new PersistableBundle();
        double paramAsDouble = getParamAsDouble(region.get("radius"), "Region: radius: `" + region.get("radius") + "` can't be cast to Double");
        double paramAsDouble2 = getParamAsDouble(region.get(OrcaKeys.LONGITUDE), "Region: longitude: `" + region.get(OrcaKeys.LONGITUDE) + "` can't be cast to Double");
        double paramAsDouble3 = getParamAsDouble(region.get(OrcaKeys.LATITUDE), "Region: latitude: `" + region.get(OrcaKeys.LATITUDE) + "` can't be cast to Double");
        persistableBundle.putString("identifier", identifier);
        persistableBundle.putDouble("radius", paramAsDouble);
        persistableBundle.putDouble(OrcaKeys.LATITUDE, paramAsDouble3);
        persistableBundle.putDouble(OrcaKeys.LONGITUDE, paramAsDouble2);
        persistableBundle.putInt("state", GeofencingRegionState.UNKNOWN.ordinal());
        return persistableBundle;
    }

    private final int eventTypeFromTransitionType(int transitionType) {
        int i11 = 1;
        if (transitionType != 1) {
            i11 = 2;
            if (transitionType != 2) {
                return 0;
            }
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Geofence geofenceFromRegion(Map<String, ? extends Object> region) throws GeofencingException {
        Object obj = region.get("identifier");
        String string = obj instanceof String ? (String) obj : null;
        if (string == null) {
            string = UUID.randomUUID().toString();
            s.j(string, "toString(...)");
        }
        double paramAsDouble = getParamAsDouble(region.get("radius"), "Region: radius: `" + region.get("radius") + "` can't be cast to Double");
        double paramAsDouble2 = getParamAsDouble(region.get(OrcaKeys.LONGITUDE), "Region: longitude: `" + region.get(OrcaKeys.LONGITUDE) + "` can't be cast to Double");
        double paramAsDouble3 = getParamAsDouble(region.get(OrcaKeys.LATITUDE), "Region: latitude `" + region.get(OrcaKeys.LATITUDE) + "` can't be cast to Double");
        Object obj2 = region.get("notifyOnEnter");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : 1;
        Object obj3 = region.get("notifyOnExit");
        Boolean bool2 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        Geofence geofenceBuild = new Geofence.Builder().setRequestId(string).setCircularRegion(paramAsDouble3, paramAsDouble2, (float) paramAsDouble).setExpirationDuration(-1L).setTransitionTypes((bool2 != null ? bool2.booleanValue() : true ? 2 : 0) | zBooleanValue).build();
        s.j(geofenceBuild, "build(...)");
        return geofenceBuild;
    }

    private final double getParamAsDouble(Object param, String errorMessage) throws GeofencingException {
        Double dU;
        if (param instanceof Double) {
            dU = (Double) param;
        } else if (param instanceof Float) {
            dU = Double.valueOf(((Number) param).floatValue());
        } else if (param instanceof Integer) {
            dU = Double.valueOf(((Number) param).intValue());
        } else if (param instanceof Long) {
            dU = Double.valueOf(((Number) param).longValue());
        } else {
            dU = param instanceof String ? t.u((String) param) : null;
        }
        if (dU != null) {
            return dU.doubleValue();
        }
        throw new GeofencingException(errorMessage, null, 2, null);
    }

    private final GeofencingRequest prepareGeofencingRequest(List<? extends Geofence> geofences) {
        GeofencingRequest geofencingRequestBuild = new GeofencingRequest.Builder().setInitialTrigger(3).addGeofences(geofences).build();
        s.j(geofencingRequestBuild, "build(...)");
        return geofencingRequestBuild;
    }

    private final PendingIntent preparePendingIntent() {
        PendingIntent pendingIntentCreateTaskIntent = getTaskManagerUtils().createTaskIntent(getContext(), this.mTask);
        s.j(pendingIntentCreateTaskIntent, "createTaskIntent(...)");
        return pendingIntentCreateTaskIntent;
    }

    private final GeofencingRegionState regionStateForTransitionType(int transitionType) {
        if (transitionType != 1) {
            if (transitionType == 2) {
                return GeofencingRegionState.OUTSIDE;
            }
            if (transitionType != 4) {
                return GeofencingRegionState.UNKNOWN;
            }
        }
        return GeofencingRegionState.INSIDE;
    }

    private final void startGeofencing() throws GeofencingException {
        Map<String, Object> options;
        GeofencingRequest geofencingRequest;
        Context context = getContext();
        if (context == null) {
            Log.w(TAG, "The context has been abandoned");
            return;
        }
        if (!LocationHelpers.INSTANCE.isAnyProviderAvailable(context)) {
            Log.w(TAG, "There is no location provider available");
            return;
        }
        this.mRegions = new HashMap();
        this.mGeofencingList = new ArrayList();
        TaskInterface taskInterface = this.mTask;
        if (taskInterface == null || (options = taskInterface.getOptions()) == null) {
            throw new GeofencingException("Task is null, can't start geofencing", null, 2, null);
        }
        Object obj = options.get("regions");
        s.i(obj, "null cannot be cast to non-null type java.util.ArrayList<*>");
        ArrayList<HashMap> arrayList = new ArrayList();
        for (Object obj2 : (ArrayList) obj) {
            if (obj2 instanceof HashMap) {
                arrayList.add(obj2);
            }
        }
        for (HashMap map : arrayList) {
            Geofence geofenceGeofenceFromRegion = geofenceFromRegion(map);
            String requestId = geofenceGeofenceFromRegion.getRequestId();
            s.j(requestId, "getRequestId(...)");
            this.mRegions.put(requestId, bundleFromRegion(requestId, map));
            this.mGeofencingList.add(geofenceGeofenceFromRegion);
        }
        this.mPendingIntent = preparePendingIntent();
        this.mGeofencingRequest = prepareGeofencingRequest(this.mGeofencingList);
        GeofencingClient geofencingClient = LocationServices.getGeofencingClient(getContext());
        this.mGeofencingClient = geofencingClient;
        try {
            PendingIntent pendingIntent = this.mPendingIntent;
            if (pendingIntent == null || (geofencingRequest = this.mGeofencingRequest) == null || geofencingClient == null) {
                return;
            }
            geofencingClient.addGeofences(geofencingRequest, pendingIntent);
        } catch (SecurityException e11) {
            Log.w(TAG, "Geofencing request has been rejected.", e11);
        }
    }

    private final void stopGeofencing() {
        PendingIntent pendingIntent = this.mPendingIntent;
        if (pendingIntent != null) {
            GeofencingClient geofencingClient = this.mGeofencingClient;
            if (geofencingClient != null) {
                geofencingClient.removeGeofences(pendingIntent);
            }
            pendingIntent.cancel();
        }
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumer, expo.modules.interfaces.taskManager.TaskConsumerInterface
    public boolean didExecuteJob(final JobService jobService, final JobParameters params) {
        s.k(jobService, "jobService");
        s.k(params, "params");
        TaskInterface taskInterface = this.mTask;
        if (taskInterface == null) {
            return false;
        }
        for (PersistableBundle persistableBundle : getTaskManagerUtils().extractDataFromJobParams(params)) {
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle2.putAll(persistableBundle.getPersistableBundle("region"));
            bundle.putInt("eventType", persistableBundle.getInt("eventType"));
            bundle.putBundle("region", bundle2);
            taskInterface.execute(bundle, null, new TaskExecutionCallback() { // from class: expo.modules.location.taskConsumers.a
                @Override // expo.modules.interfaces.taskManager.TaskExecutionCallback
                public final void onFinished(Map map) {
                    jobService.jobFinished(params, false);
                }
            });
        }
        return true;
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumer, expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void didReceiveBroadcast(Intent intent) {
        s.k(intent, "intent");
        GeofencingEvent geofencingEventFromIntent = GeofencingEvent.fromIntent(intent);
        if (geofencingEventFromIntent == null) {
            Log.w(TAG, "Received a null geofencing event. Ignoring");
            return;
        }
        if (geofencingEventFromIntent.hasError()) {
            Error error = new Error(INSTANCE.getErrorString(geofencingEventFromIntent.getErrorCode()));
            TaskInterface taskInterface = this.mTask;
            if (taskInterface != null) {
                taskInterface.execute(null, error);
                return;
            }
            return;
        }
        int geofenceTransition = geofencingEventFromIntent.getGeofenceTransition();
        GeofencingRegionState geofencingRegionStateRegionStateForTransitionType = regionStateForTransitionType(geofenceTransition);
        int iEventTypeFromTransitionType = eventTypeFromTransitionType(geofenceTransition);
        List<Geofence> triggeringGeofences = geofencingEventFromIntent.getTriggeringGeofences();
        if (triggeringGeofences == null) {
            return;
        }
        Iterator<Geofence> it = triggeringGeofences.iterator();
        while (it.hasNext()) {
            PersistableBundle persistableBundle = this.mRegions.get(it.next().getRequestId());
            if (persistableBundle != null) {
                PersistableBundle persistableBundle2 = new PersistableBundle();
                persistableBundle.putInt("state", geofencingRegionStateRegionStateForTransitionType.ordinal());
                persistableBundle2.putInt("eventType", iEventTypeFromTransitionType);
                persistableBundle2.putPersistableBundle("region", persistableBundle);
                getTaskManagerUtils().scheduleJob(getContext().getApplicationContext(), this.mTask, v.e(persistableBundle2));
            }
        }
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void didRegister(TaskInterface task) throws GeofencingException {
        s.k(task, "task");
        this.mTask = task;
        startGeofencing();
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void didUnregister() {
        stopGeofencing();
        this.mTask = null;
        this.mPendingIntent = null;
        this.mGeofencingClient = null;
        this.mGeofencingRequest = null;
        this.mGeofencingList.clear();
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumer, expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void setOptions(Map<String, ? extends Object> options) throws GeofencingException {
        s.k(options, "options");
        super.setOptions(options);
        stopGeofencing();
        startGeofencing();
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public String taskType() {
        return "geofencing";
    }
}
