-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 20, 2021 at 12:36 PM
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
-- Table structure for table `konsultasi_audiovideo`
--

CREATE TABLE `konsultasi_audiovideo` (
  `username` varchar(45) NOT NULL,
  `tanggal` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tipe_konsultasi` enum('Video','Audio') NOT NULL,
  `durasi` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `konsultasi_audiovideo`
--

INSERT INTO `konsultasi_audiovideo` (`username`, `tanggal`, `tipe_konsultasi`, `durasi`) VALUES
('John1121', '2021-06-02 17:00:00', 'Video', 20);

-- --------------------------------------------------------

--
-- Table structure for table `konsultasi_teks`
--

CREATE TABLE `konsultasi_teks` (
  `username` varchar(45) NOT NULL,
  `tanggal` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `isi` varchar(211) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `konsultasi_teks`
--

INSERT INTO `konsultasi_teks` (`username`, `tanggal`, `isi`) VALUES
('Antonio2001', '2021-06-08 17:00:00', 'Halo apakah saya bisa mengetahui isi rumahnya?');

-- --------------------------------------------------------

--
-- Table structure for table `properti`
--

CREATE TABLE `properti` (
  `id` int(11) NOT NULL,
  `nama` varchar(45) NOT NULL,
  `alamat` varchar(45) NOT NULL,
  `deskripsi` longtext NOT NULL,
  `harga` int(11) NOT NULL,
  `rating` double NOT NULL,
  `kota` varchar(45) NOT NULL,
  `tipe_properti` enum('Rumah','Apartemen','Villa') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `properti`
--

INSERT INTO `properti` (`id`, `nama`, `alamat`, `deskripsi`, `harga`, `rating`, `kota`, `tipe_properti`) VALUES
(1, 'Apartemen Gunawangsa', 'Jalan Raya Kedung Baruk No.86, Kedung Baruk', 'Gunawangsa Manyar Apartment adalah sebuah proyek dari Gunawangsa Group yang menghadirkan suatu konsep Apartemen middle-high class dengan berbagai fasilitas high-class dan di lokasi yang sangat strategis di Surabaya.', 1800000, 5, 'Surabaya', 'Apartemen'),
(2, 'Rumah Greenville', 'Jl. Bonto Bulaleng No.13', 'Greenville adalah sebuah kawasan hunian bergengsi yang berada di wilayah Jakarta Selatan. Perumahan ini adalah besutan PT Mahkota Berlian Cemerlang, perusahaan yang sudah puluhan tahun berkiprah di kancah properti tanah air, terutama di Kota Jakarta Selatan.\r\n', 1000000, 4, 'Jakarta Selatan', 'Rumah'),
(3, 'Villa Minerva', 'Jalan Lapang Desa, RT1/ 11, Desa Cibogo, Lemb', 'Villa Minerva merupakan villa di bagian Puncak, Bandung yang siap memukau Anda dengan pemandangan gunung di pagi hari. Segera nikmati liburan Anda di villa Minerva!', 350000, 4, 'Bandung', 'Villa');

-- --------------------------------------------------------

--
-- Table structure for table `riwayat_transaksi`
--

CREATE TABLE `riwayat_transaksi` (
  `id` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `properti_id` int(11) NOT NULL,
  `harga` int(11) NOT NULL,
  `tanggal_penyewaan` varchar(211) NOT NULL,
  `durasi_sewa` int(11) NOT NULL,
  `jumlah_orang` int(11) NOT NULL,
  `tipe_pembayaran` enum('Debit','Kredit') NOT NULL,
  `nomor_kartu` varchar(45) NOT NULL,
  `catatan` varchar(200) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `riwayat_transaksi`
--

INSERT INTO `riwayat_transaksi` (`id`, `username`, `properti_id`, `harga`, `tanggal_penyewaan`, `durasi_sewa`, `jumlah_orang`, `tipe_pembayaran`, `nomor_kartu`, `catatan`, `status`) VALUES
(2, 'kenneth', 1, 1800000, '2021-06-22', 4, 1, 'Kredit', '8653221234', 'Mohon tambahan single bed', 0),
(3, 'kenneth', 3, 1050000, '2021-06-29', 3, 3, 'Kredit', '43434343434', 'Halo', 0),
(4, 'kenneth', 3, 700000, '2021-06-19', 2, 1, 'Debit', '23423423423424', 'Hello', 0),
(5, 'kenneth', 3, 1050000, '2021-07-20', 3, 1, 'Debit', '10101010', '', 0),
(6, 'kenneth', 3, 1400000, '2021-07-23', 4, 4, 'Debit', '5405945', '', 0);

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
  `tanggal_lahir` varchar(211) NOT NULL,
  `tempat_lahir` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`, `nama`, `alamat`, `nomor_telpon`, `tanggal_lahir`, `tempat_lahir`) VALUES
('angelo123', 'angelo', 'Angelo', 'Jl. Balu No.38', '0930498938', '1998-08-12', 'Kalimantan Utara'),
('Antonio2001', 'antonio2001', 'Antonio Perisic', 'Jl. Kedang Sari No. 22, Surabaya', '083326419887', '2001-06-10', 'Surabaya'),
('John1121', 'john1121', 'John Patrick', 'Jl. Arif Rahman Hakim No. 26, Surabaya', '082112253214', '1996-08-01', 'Surabaya'),
('kenneth', 'kenneth', 'Kenneth Angelo', 'Jalan Kintamani No.38', '0894573462', '2001-06-24', 'Bali'),
('mangoose', 'jack', 'Mr. Jim', 'Jl. Batu Ampar no 26', '02193213214', '2021-12-05', 'Balikpapan'),
('pelix', 'pelix555', 'Patrick', 'Jalan Petambangan No.57', '0923131249', '2001-06-20', 'Kalimantan Timur');

--
-- Indexes for dumped tables
--

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
  ADD KEY `fk_transaksi_user_idx` (`username`),
  ADD KEY `fk_transaksi_rumah1_idx` (`properti_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `properti`
--
ALTER TABLE `properti`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `riwayat_transaksi`
--
ALTER TABLE `riwayat_transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

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
  ADD CONSTRAINT `fk_transaksi_rumah1` FOREIGN KEY (`properti_id`) REFERENCES `properti` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_transaksi_user` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
