-- phpMyAdmin SQL Dump
-- version 4.9.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Waktu pembuatan: 31 Jul 2020 pada 15.23
-- Versi server: 5.7.26
-- Versi PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `koin_nu`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `No` int(11) NOT NULL,
  `kecamatan` varchar(100) NOT NULL,
  `jumlah` int(15) NOT NULL,
  `tgltransaksi` varchar(12) NOT NULL,
  `kotakinfaq` varchar(15) NOT NULL,
  `totaltransaksi` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`No`, `kecamatan`, `jumlah`, `tgltransaksi`, `kotakinfaq`, `totaltransaksi`) VALUES
(1, 'Kepanjenkidul', 10000, '25-07-2020', 'kotak 1', 10000),
(2, 'Kepanjenkidul', 15000, '24-07-2020', 'kotak 2', 25000),
(3, 'Sananwetan', 12000, '25-07-2020', 'kotak 2', 37000),
(4, 'Sananwetan', 10000, '25-07-2020', 'kotak 2', 47000),
(5, 'Sananwetan', 15000, '26-07-2020', 'kotak 4', 62000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`No`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
