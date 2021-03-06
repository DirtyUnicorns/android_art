/*
 * Copyright (C) 2017 The Android Open Source Project
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

public class DummyClass implements ParentInterface {
  public int methodPublicWhitelist() { return 1; }
  public int methodPublicLightGreylist() { return 2; }
  public int methodPublicDarkGreylist() { return 3; }
  public int methodPublicBlacklist() { return 4; }
  public int methodPublicBlacklistAndCorePlatformApi() { return 5; }

  public static ParentInterface getInterfaceInstance() {
    return new DummyClass();
  }
}
