-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 08, 2021 at 05:42 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myrental`
--

-- --------------------------------------------------------

--
-- Table structure for table `foto`
--

CREATE TABLE `foto` (
  `id` int(11) NOT NULL,
  `properti_id` int(11) NOT NULL,
  `foto1` blob NOT NULL,
  `foto2` blob,
  `foto3` blob,
  `foto4` blob
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `konsultasi_audiovideo`
--

CREATE TABLE `konsultasi_audiovideo` (
  `username` varchar(45) NOT NULL,
  `tanggal` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tipe_konsultasi` enum('Video','Audio') NOT NULL,
  `durasi` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `konsultasi_teks`
--

CREATE TABLE `konsultasi_teks` (
  `username` varchar(45) NOT NULL,
  `tanggal` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `isi` varchar(211) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `properti`
--

CREATE TABLE `properti` (
  `id` int(11) NOT NULL,
  `nama` varchar(45) NOT NULL,
  `alamat` varchar(45) NOT NULL,
  `deskripsi` longtext NOT NULL,
  `harga` double NOT NULL,
  `rating` double NOT NULL,
  `kota` varchar(45) NOT NULL,
  `status` enum('Tersewa','Belum tersewa') NOT NULL,
  `tipe_properti` enum('Rumah','Apartemen','Villa') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `riwayat_transaksi`
--

CREATE TABLE `riwayat_transaksi` (
  `id` int(11) NOT NULL,
  `user_username` varchar(45) NOT NULL,
  `rumah_id` int(11) NOT NULL,
  `harga` double NOT NULL,
  `tanggal_penyewaan` datetime NOT NULL,
  `durasi_sewa` int(11) NOT NULL,
  `jumlah_orang` varchar(45) NOT NULL,
  `tipe_pembayaran` enum('Debit','Kredit') NOT NULL,
  `nomor_kartu` varchar(45) NOT NULL,
  `diskon` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(45) NOT NULL,
  `password` varchar(211) NOT NULL,
  `nama` varchar(45) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `nomor_telpon` varchar(45) NOT NULL,
  `tanggal_lahir` datetime NOT NULL,
  `tempat_lahir` varchar(45) NOT NULL,
  `foto` blob
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `foto`
--
ALTER TABLE `foto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_foto_properti1_idx` (`properti_id`);

--
-- Indexes for table `konsultasi_audiovideo`
--
ALTER TABLE `konsultasi_audiovideo`
  ADD KEY `fk_riwayat_admin_user1_idx` (`username`);

--
-- Indexes for table `konsultasi_teks`
--
ALTER TABLE `konsultasi_teks`
  ADD KEY `fk_riwayat_konsultasi_teks_user1_idx` (`username`);

--
-- Indexes for table `properti`
--
ALTER TABLE `properti`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `riwayat_transaksi`
--
ALTER TABLE `riwayat_transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_transaksi_user_idx` (`user_username`),
  ADD KEY `fk_transaksi_rumah1_idx` (`rumah_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `foto`
--
ALTER TABLE `foto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `properti`
--
ALTER TABLE `properti`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `foto`
--
ALTER TABLE `foto`
  ADD CONSTRAINT `fk_foto_properti1` FOREIGN KEY (`properti_id`) REFERENCES `properti` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `konsultasi_audiovideo`
--
ALTER TABLE `konsultasi_audiovideo`
  ADD CONSTRAINT `fk_riwayat_admin_user1` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `konsultasi_teks`
--
ALTER TABLE `konsultasi_teks`
  ADD CONSTRAINT `fk_riwayat_konsultasi_teks_user1` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `riwayat_transaksi`
--
ALTER TABLE `riwayat_transaksi`
  ADD CONSTRAINT `fk_transaksi_rumah1` FOREIGN KEY (`rumah_id`) REFERENCES `properti` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_transaksi_user` FOREIGN KEY (`user_username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
