package expo.modules.location.taskConsumers;

import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import expo.modules.core.MapHelper;
import expo.modules.core.arguments.MapArguments;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.interfaces.taskManager.TaskConsumer;
import expo.modules.interfaces.taskManager.TaskConsumerInterface;
import expo.modules.interfaces.taskManager.TaskExecutionCallback;
import expo.modules.interfaces.taskManager.TaskInterface;
import expo.modules.interfaces.taskManager.TaskManagerUtilsInterface;
import expo.modules.location.AppForegroundedSingleton;
import expo.modules.location.LocationHelpers;
import expo.modules.location.records.LocationOptions;
import expo.modules.location.records.LocationResponse;
import expo.modules.location.services.LocationTaskService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001XB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u001d\u0010\u0013\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\"\u001a\u00020\n2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010\fJ#\u0010/\u001a\u00020\n2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020-0,H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00109\u001a\u00020\u00162\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010\fJ\u000f\u0010<\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010\fJ\u000f\u0010=\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u0010\fR\u0018\u0010>\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00110M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lexpo/modules/location/taskConsumers/LocationTaskConsumer;", "Lexpo/modules/interfaces/taskManager/TaskConsumer;", "Lexpo/modules/interfaces/taskManager/TaskConsumerInterface;", "Lexpo/modules/core/interfaces/LifecycleEventListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;", "taskManagerUtils", "<init>", "(Landroid/content/Context;Lexpo/modules/interfaces/taskManager/TaskManagerUtilsInterface;)V", "Ljn0/h0;", "startLocationUpdates", "()V", "stopLocationUpdates", "maybeStartForegroundService", "stopForegroundService", "", "Landroid/location/Location;", "locations", "deferLocations", "(Ljava/util/List;)V", "maybeReportDeferredLocations", "", "shouldReportDeferredLocations", "()Z", "Landroid/app/PendingIntent;", "preparePendingIntent", "()Landroid/app/PendingIntent;", "Ljava/util/ArrayList;", "Landroid/os/Bundle;", "Lkotlin/collections/ArrayList;", "locationBundles", "Lexpo/modules/interfaces/taskManager/TaskExecutionCallback;", "callback", "executeTaskWithLocationBundles", "(Ljava/util/ArrayList;Lexpo/modules/interfaces/taskManager/TaskExecutionCallback;)V", "", "taskType", "()Ljava/lang/String;", "Lexpo/modules/interfaces/taskManager/TaskInterface;", "task", "didRegister", "(Lexpo/modules/interfaces/taskManager/TaskInterface;)V", "didUnregister", "", "", "options", "setOptions", "(Ljava/util/Map;)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "didReceiveBroadcast", "(Landroid/content/Intent;)V", "Landroid/app/job/JobService;", "jobService", "Landroid/app/job/JobParameters;", "params", "didExecuteJob", "(Landroid/app/job/JobService;Landroid/app/job/JobParameters;)Z", "onHostResume", "onHostPause", "onHostDestroy", "mTask", "Lexpo/modules/interfaces/taskManager/TaskInterface;", "mPendingIntent", "Landroid/app/PendingIntent;", "Lexpo/modules/location/services/LocationTaskService;", "mService", "Lexpo/modules/location/services/LocationTaskService;", "Lcom/google/android/gms/location/LocationRequest;", "mLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "mLastReportedLocation", "Landroid/location/Location;", "", "mDeferredDistance", "D", "", "mDeferredLocations", "Ljava/util/List;", "mIsHostPaused", "Z", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mLocationClient$delegate", "Lkotlin/Lazy;", "getMLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "mLocationClient", "Companion", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocationTaskConsumer extends TaskConsumer implements TaskConsumerInterface, LifecycleEventListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FOREGROUND_SERVICE_KEY = "foregroundService";
    private static final String TAG = "LocationTaskConsumer";
    private static long sLastTimestamp;
    private double mDeferredDistance;
    private final List<Location> mDeferredLocations;
    private boolean mIsHostPaused;
    private Location mLastReportedLocation;

    /* JADX INFO: renamed from: mLocationClient$delegate, reason: from kotlin metadata */
    private final Lazy mLocationClient;
    private LocationRequest mLocationRequest;
    private PendingIntent mPendingIntent;
    private LocationTaskService mService;
    private TaskInterface mTask;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lexpo/modules/location/taskConsumers/LocationTaskConsumer$Companion;", "", "<init>", "()V", "TAG", "", "FOREGROUND_SERVICE_KEY", "sLastTimestamp", "", "shouldUseForegroundService", "", "options", "", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean shouldUseForegroundService(Map<String, ? extends Object> options) {
            s.k(options, "options");
            return options.containsKey(LocationTaskConsumer.FOREGROUND_SERVICE_KEY);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationTaskConsumer(final Context context, TaskManagerUtilsInterface taskManagerUtilsInterface) {
        super(context, taskManagerUtilsInterface);
        s.k(context, "context");
        this.mDeferredLocations = new ArrayList();
        this.mIsHostPaused = true;
        this.mLocationClient = m.b(new wn0.a() { // from class: expo.modules.location.taskConsumers.c
            @Override // wn0.a
            public final Object invoke() {
                return LocationTaskConsumer.mLocationClient_delegate$lambda$0(context);
            }
        });
    }

    private final void deferLocations(List<? extends Location> locations) {
        int size = this.mDeferredLocations.size();
        Location location = size > 0 ? this.mDeferredLocations.get(size - 1) : this.mLastReportedLocation;
        for (Location location2 : locations) {
            if (location != null) {
                this.mDeferredDistance += (double) Math.abs(location2.distanceTo(location));
            }
            location = location2;
        }
        this.mDeferredLocations.addAll(locations);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void didReceiveBroadcast$lambda$2(LocationTaskConsumer locationTaskConsumer, Task task) {
        s.k(task, "task");
        Location location = (Location) task.getResult();
        if (location != null) {
            locationTaskConsumer.deferLocations(v.e(location));
            locationTaskConsumer.maybeReportDeferredLocations();
        }
    }

    private final void executeTaskWithLocationBundles(ArrayList<Bundle> locationBundles, TaskExecutionCallback callback) {
        if (locationBundles.size() <= 0 || this.mTask == null) {
            callback.onFinished(null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("locations", locationBundles);
        TaskInterface taskInterface = this.mTask;
        if (taskInterface != null) {
            taskInterface.execute(bundle, null, callback);
        }
    }

    private final FusedLocationProviderClient getMLocationClient() {
        return (FusedLocationProviderClient) this.mLocationClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FusedLocationProviderClient mLocationClient_delegate$lambda$0(Context context) {
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        s.j(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        return fusedLocationProviderClient;
    }

    private final void maybeReportDeferredLocations() {
        if (shouldReportDeferredLocations()) {
            Context applicationContext = getContext().getApplicationContext();
            ArrayList arrayList = new ArrayList();
            for (Location location : this.mDeferredLocations) {
                long time = location.getTime();
                if (time > sLastTimestamp) {
                    arrayList.add((PersistableBundle) new LocationResponse(location).toBundle$expo_location_release(PersistableBundle.class));
                    sLastTimestamp = time;
                }
            }
            if (arrayList.size() > 0) {
                List<Location> list = this.mDeferredLocations;
                this.mLastReportedLocation = list.get(list.size() - 1);
                this.mDeferredDistance = 0.0d;
                this.mDeferredLocations.clear();
                getTaskManagerUtils().scheduleJob(applicationContext, this.mTask, arrayList);
            }
        }
    }

    private final void maybeStartForegroundService() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (!AppForegroundedSingleton.INSTANCE.isForegrounded()) {
            Log.w(TAG, "Foreground location task cannot be started while the app is in the background!");
            return;
        }
        TaskInterface taskInterface = this.mTask;
        if (taskInterface == null) {
            Log.w(TAG, "Location task is null");
            return;
        }
        MapArguments mapArguments = new MapArguments(taskInterface.getOptions());
        Companion companion = INSTANCE;
        Map<String, ? extends Object> options = taskInterface.getOptions();
        s.j(options, "getOptions(...)");
        boolean zShouldUseForegroundService = companion.shouldUseForegroundService(options);
        LocationTaskService locationTaskService = this.mService;
        if (locationTaskService != null && !zShouldUseForegroundService) {
            stopForegroundService();
            return;
        }
        if (zShouldUseForegroundService) {
            if (locationTaskService != null) {
                if (locationTaskService != null) {
                    Bundle bundle = mapArguments.getArguments(FOREGROUND_SERVICE_KEY).toBundle();
                    s.j(bundle, "toBundle(...)");
                    locationTaskService.startForeground(bundle);
                    return;
                }
                return;
            }
            Intent intent = new Intent(getContext(), (Class<?>) LocationTaskService.class);
            Bundle bundle2 = new Bundle();
            final Bundle bundle3 = mapArguments.getArguments(FOREGROUND_SERVICE_KEY).toBundle();
            bundle2.putString("appId", taskInterface.getAppScopeKey());
            bundle2.putString("taskName", taskInterface.getName());
            bundle2.putBoolean("killService", bundle3.getBoolean("killServiceOnDestroy", false));
            intent.putExtras(bundle2);
            getContext().startForegroundService(intent);
            getContext().bindService(intent, new ServiceConnection() { // from class: expo.modules.location.taskConsumers.LocationTaskConsumer.maybeStartForegroundService.1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName name, IBinder service) {
                    s.k(name, "name");
                    s.k(service, "service");
                    LocationTaskConsumer locationTaskConsumer = LocationTaskConsumer.this;
                    LocationTaskService.ServiceBinder serviceBinder = service instanceof LocationTaskService.ServiceBinder ? (LocationTaskService.ServiceBinder) service : null;
                    locationTaskConsumer.mService = serviceBinder != null ? serviceBinder.getThis$0() : null;
                    LocationTaskService locationTaskService2 = LocationTaskConsumer.this.mService;
                    if (locationTaskService2 != null) {
                        LocationTaskConsumer locationTaskConsumer2 = LocationTaskConsumer.this;
                        Bundle bundle4 = bundle3;
                        Context context = locationTaskConsumer2.getContext();
                        s.j(context, "access$getContext(...)");
                        locationTaskService2.setParentContext(context);
                        s.h(bundle4);
                        locationTaskService2.startForeground(bundle4);
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName name) {
                    s.k(name, "name");
                    LocationTaskService locationTaskService2 = LocationTaskConsumer.this.mService;
                    if (locationTaskService2 != null) {
                        locationTaskService2.stop();
                    }
                    LocationTaskConsumer.this.mService = null;
                }
            }, 1);
        }
    }

    private final PendingIntent preparePendingIntent() {
        PendingIntent pendingIntentCreateTaskIntent = getTaskManagerUtils().createTaskIntent(getContext(), this.mTask);
        s.j(pendingIntentCreateTaskIntent, "createTaskIntent(...)");
        return pendingIntentCreateTaskIntent;
    }

    private final boolean shouldReportDeferredLocations() {
        TaskInterface taskInterface = this.mTask;
        if (taskInterface == null || this.mDeferredLocations.size() == 0) {
            return false;
        }
        if (!this.mIsHostPaused) {
            return true;
        }
        Location location = this.mLastReportedLocation;
        if (location == null) {
            location = this.mDeferredLocations.get(0);
        }
        List<Location> list = this.mDeferredLocations;
        Location location2 = list.get(list.size() - 1);
        MapHelper mapHelper = new MapHelper(taskInterface.getOptions());
        return location2.getTime() - location.getTime() >= mapHelper.getLong("deferredUpdatesInterval") && this.mDeferredDistance >= mapHelper.getDouble("deferredUpdatesDistance");
    }

    private final void startLocationUpdates() {
        Context context = getContext();
        if (context == null) {
            Log.w(TAG, "The context has been abandoned");
            return;
        }
        LocationHelpers.Companion companion = LocationHelpers.INSTANCE;
        if (!companion.isAnyProviderAvailable(context)) {
            Log.w(TAG, "There is no location provider available");
            return;
        }
        TaskInterface taskInterface = this.mTask;
        if (taskInterface == null) {
            Log.w(TAG, "Could not find a location task for the location update");
            return;
        }
        Map<String, Object> options = taskInterface.getOptions();
        s.j(options, "getOptions(...)");
        this.mLocationRequest = companion.prepareLocationRequest$expo_location_release(new LocationOptions(options));
        PendingIntent pendingIntentPreparePendingIntent = preparePendingIntent();
        this.mPendingIntent = pendingIntentPreparePendingIntent;
        LocationRequest locationRequest = this.mLocationRequest;
        if (locationRequest == null) {
            Log.w(TAG, "Could not find a location request for the location update");
            return;
        }
        if (pendingIntentPreparePendingIntent == null) {
            Log.w(TAG, "Could not find intent for the location update");
            return;
        }
        try {
            getMLocationClient().requestLocationUpdates(locationRequest, pendingIntentPreparePendingIntent);
        } catch (SecurityException e11) {
            Log.w(TAG, "Location request has been rejected.", e11);
        }
    }

    private final void stopForegroundService() {
        LocationTaskService locationTaskService = this.mService;
        if (locationTaskService != null) {
            locationTaskService.stop();
        }
    }

    private final void stopLocationUpdates() {
        PendingIntent pendingIntent = this.mPendingIntent;
        if (pendingIntent != null) {
            getMLocationClient().removeLocationUpdates(pendingIntent);
            pendingIntent.cancel();
        }
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumer, expo.modules.interfaces.taskManager.TaskConsumerInterface
    public boolean didExecuteJob(final JobService jobService, final JobParameters params) {
        s.k(jobService, "jobService");
        s.k(params, "params");
        List<PersistableBundle> listExtractDataFromJobParams = getTaskManagerUtils().extractDataFromJobParams(params);
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (PersistableBundle persistableBundle : listExtractDataFromJobParams) {
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            if (persistableBundle != null) {
                bundle2.putAll(persistableBundle.getPersistableBundle("coords"));
                bundle.putAll(persistableBundle);
                bundle.putBundle("coords", bundle2);
                arrayList.add(bundle);
            }
        }
        executeTaskWithLocationBundles(arrayList, new TaskExecutionCallback() { // from class: expo.modules.location.taskConsumers.d
            @Override // expo.modules.interfaces.taskManager.TaskExecutionCallback
            public final void onFinished(Map map) {
                jobService.jobFinished(params, false);
            }
        });
        return true;
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumer, expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void didReceiveBroadcast(Intent intent) {
        s.k(intent, "intent");
        if (this.mTask == null) {
            return;
        }
        LocationResult locationResultExtractResult = LocationResult.extractResult(intent);
        if (locationResultExtractResult != null) {
            List<Location> locations = locationResultExtractResult.getLocations();
            s.j(locations, "getLocations(...)");
            deferLocations(locations);
            maybeReportDeferredLocations();
            return;
        }
        try {
            getMLocationClient().getLastLocation().addOnCompleteListener(new OnCompleteListener() { // from class: expo.modules.location.taskConsumers.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    LocationTaskConsumer.didReceiveBroadcast$lambda$2(this.f63404a, task);
                }
            });
        } catch (SecurityException e11) {
            Log.e(TAG, "Cannot get last location: " + e11.getMessage());
        }
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void didRegister(TaskInterface task) {
        s.k(task, "task");
        this.mTask = task;
        startLocationUpdates();
        maybeStartForegroundService();
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void didUnregister() {
        stopLocationUpdates();
        stopForegroundService();
        this.mTask = null;
        this.mPendingIntent = null;
        this.mLocationRequest = null;
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
        this.mIsHostPaused = true;
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
        this.mIsHostPaused = true;
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        this.mIsHostPaused = false;
        maybeReportDeferredLocations();
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumer, expo.modules.interfaces.taskManager.TaskConsumerInterface
    public void setOptions(Map<String, ? extends Object> options) {
        s.k(options, "options");
        super.setOptions(options);
        stopLocationUpdates();
        startLocationUpdates();
        maybeStartForegroundService();
    }

    @Override // expo.modules.interfaces.taskManager.TaskConsumerInterface
    public String taskType() {
        return "location";
    }
}
