// Copyright 2016 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

#include "mash/init/init.h"
#include "mojo/public/c/system/main.h"
#include "mojo/shell/public/cpp/application_runner.h"

MojoResult MojoMain(MojoHandle shell_handle) {
  mojo::ApplicationRunner runner(new mash::init::Init);
  return runner.Run(shell_handle);
}
