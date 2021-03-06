/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rocklobstre.parrot.dependencyinjection.components;

import android.content.Context;
import android.media.AudioManager;
import android.os.PowerManager;
import android.os.Vibrator;

import com.mapzen.speakerbox.Speakerbox;
import com.rocklobstre.parrot.data.local.AlarmSource;
import com.rocklobstre.parrot.data.alarmservice.AlarmManager;
import com.rocklobstre.parrot.data.remote.RestApi;
import com.rocklobstre.parrot.data.remote.executor.PostExecutionThread;
import com.rocklobstre.parrot.data.remote.executor.ThreadExecutor;
import com.rocklobstre.parrot.data.remote.repository.AlarmRepository;
import com.rocklobstre.parrot.dependencyinjection.modules.ApplicationModule;
import com.rocklobstre.parrot.dependencyinjection.modules.DataModule;
import com.rocklobstre.parrot.dependencyinjection.scope.MainApplicationScope;
import com.rocklobstre.parrot.util.BaseSchedulerProvider;

import dagger.Component;

/**
 *The Application Component Provides
 */
@MainApplicationScope
@Component(modules = {ApplicationModule.class, DataModule.class})
public interface ApplicationComponent {

  Context context();
  PowerManager.WakeLock wakeLock();
  AudioManager audioManager();
  Vibrator vibrator();
  AlarmManager alarmManager();
  AlarmSource alarmSource();
  BaseSchedulerProvider baseSchedulerProvider();
  Speakerbox getSpeakerbox();

  RestApi restApi();
  AlarmRepository alarmRepository();
  ThreadExecutor threadExecutor();
  PostExecutionThread postExecutionThread();
}
