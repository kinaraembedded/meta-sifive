DESCRIPTION = "SiFive RISC-V Core IP Demo Benchmarks Linux image"

IMAGE_FEATURES += "\
    splash \
    ssh-server-openssh \
    tools-sdk \
    tools-debug \
    tools-profile \
    doc-pkgs \
    dev-pkgs \
    nfs-client"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    kernel-modules \
    kernel-devsrc \
    kernel-dev \
    sysstat \
    dhrystone \
    whetstone \
    iperf3 \
    iperf2 \
    fio \
    tinymembench \
    sysbench \
    memtester \
    lmbench \
    vim \
    nano \
    mc \
    chrony \
    curl \
    wget \
    git \
    bind-utils \
    hexedit \
    pv \
    lsof \
    libgpiod \
    libgpiod-tools \
    libgpiod-dev \
    i2c-tools \
    i2c-tools-misc \
    spitools \
    networkmanager \
    networkmanager-nmcli \
    networkmanager-nmcli-doc \
    networkmanager-nmtui \
    networkmanager-nmtui-doc \
    haveged \
    e2fsprogs-resize2fs \
    e2fsprogs-e2fsck \
    e2fsprogs-mke2fs \
    gparted \
    parted \
    gptfdisk \
    rsync \
    screen \
    tmux \
    stress-ng \
    nbd-client \
    mpfr-dev \
    gmp-dev \
    libmpc-dev \
    zlib-dev \
    flex \
    bison \
    dejagnu \
    gettext \
    texinfo \
    procps \
    sln \
    glibc-dev \
    glibc-utils \
    glibc-staticdev \
    elfutils \
    elfutils-dev \
    elfutils-binutils \
    elfutils-staticdev \
    libasm \
    libdw \
    libelf \
    pciutils \
    usbutils \
    devmem2 \
    mtd-utils \
    sysfsutils \
    htop \
    nvme-cli \
    python3 \
    cmake \
    ninja \
    python3-scons \
    libatomic-dev \
    libatomic-staticdev \
    libgomp-dev \
    libgomp-staticdev \
    libstdc++-dev \
    libstdc++-staticdev \
    dtc \
    pcimem \
    jq \
    hdparm \
    udev-extraconf \
    clang \
    clang-dev \
    clang-libllvm \
    clang-staticdev \
    libclang \
    compiler-rt \
    compiler-rt-dev \
    compiler-rt-staticdev \
    ldd \
    libcxx \
    libcxx-dev \
    libcxx-staticdev \
    openmp \
    wireless-regdb \
    info \
    gettext-runtime \
    gperf \
    perl-module-locale \
    perl-modules \
    iw \
    gnutls-bin \
    gnutls-dev \
    openssl-bin \
    openssl-dev \
    net-tools \
    man-pages \
    man-db \
    expect \
    gfortran \
    libgfortran \
    libgfortran-dev \
    libgfortran-staticdev \
    gcov \
    gcov-symlinks \
    gcc-symlinks \
    gfortran-symlinks \
    g++-symlinks \
    gcc-plugins \
    gcc-dev \
    cpp-symlinks \
    curl-staticdev \
    dtc-staticdev \
    boost-staticdev \
    libarchive-staticdev \
    bzip2-staticdev \
    lzo-staticdev \
    zlib-staticdev \
    xz-staticdev \
    binutils-staticdev \
    gmp-staticdev \
    libaio-staticdev \
    libatomic-ops-staticdev \
    libbsd-staticdev \
    mpfr-staticdev \
    openmp-staticdev \
    patchelf \
    python3-pip \
    python3-setuptools \
    openssh-misc \
    openssh-sftp \
    openssh-sftp-server \
    lmsensors \
    smartmontools \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

IMAGE_INSTALL_append_freedom-u540 = "\
    unleashed-udev-rules \
    "

inherit core-image extrausers

EXTRA_USERS_PARAMS = "usermod -P sifive root;"
